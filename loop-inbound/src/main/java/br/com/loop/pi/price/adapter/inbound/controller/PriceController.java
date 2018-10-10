package br.com.loop.pi.price.adapter.inbound.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.loop.pi.price.adapter.inbound.error.BoardNotFoundException;
import br.com.loop.pi.price.core.client.dto.SuivDTO;
import br.com.loop.pi.price.core.port.inbound.PricePortInbound;


/**
 * @author André Franco on 08/10/2018.
 */
@RestController
@RequestMapping("/v1/price")
public class PriceController {

	
	private static final Logger log = LoggerFactory.getLogger(PriceController.class);

	@Autowired
	private PricePortInbound portInbound;

	//@PreAuthorize("#oauth2.hasScope('bar') and #oauth2.hasScope('read') and hasRole('ROLE_ADMIN_WRITE')")
	@GetMapping("/board")
	public ResponseEntity<?> findBy(@RequestParam(value = "board", required = true) String board) {
		log.info("Iniciando busca de infomações do veículo de placa: " + board);
		SuivDTO suivDTO = portInbound.findBy(board);
		if (suivDTO == null)
			throw new BoardNotFoundException( "Placa do veículo não encontrado - Placa: " + board);
		return new ResponseEntity<>( suivDTO,HttpStatus.OK);
	}

//	@GetMapping("/service-situation")
//	public ResponseEntity<?> findAllServiceSituation() {
//		return new ResponseEntity<>(messageTemplatePortInbound.findAllServiceSituation(), HttpStatus.OK);
//	}
//
//	@GetMapping("/service-category")
//	public ResponseEntity<?> findAllServiceCategory() {
//		return new ResponseEntity<>(messageTemplatePortInbound.findAllServiceCategory(), HttpStatus.OK);
//	}
//
//	@GetMapping("/recipent")
//	public ResponseEntity<?> findAllRecipent() {
//		return new ResponseEntity<>(messageTemplatePortInbound.findAllRecipent(), HttpStatus.OK);
//	}
//
//	@GetMapping("/pagination")
//	public ResponseEntity<?> getPaginationList(
//			@RequestParam(value = "terms", defaultValue = "", required = false) String terms,
//			@RequestParam(value = "status", defaultValue = "", required = false) String status,
//			@RequestParam(value = "serviceSituation", defaultValue = "", required = false) String serviceSituationType,
//			@RequestParam(value = "categoryName", defaultValue = "", required = false) String categoryName,
//			Pageable pageable, Principal principal) {
//
//		return new ResponseEntity<>(messageTemplatePortInbound.findByFiltersPaginated(terms, status,
//				serviceSituationType, categoryName, pageable), HttpStatus.OK);
//	}
//
//	@GetMapping("/{id}")
//	public ResponseEntity<?> getById(@PathVariable(value = "id") String id, Principal principal) {
//		verifyIfIdExists(id);
//		return new ResponseEntity<>(messageTemplatePortInbound.findOne(id), HttpStatus.OK);
//	}
//
//	@PostMapping()
//	public ResponseEntity save(@Valid @RequestBody MessageTemplateVO messageTemplateVO, Principal principal) {
//		if (messageTemplatePortInbound.existsToCreate(messageTemplateVO)) {
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Título ou Messagem já cadastrados.");
//		}
//		messageTemplateVO.setServiceCategory(messageTemplatePortInbound.findOneServiceCategory(messageTemplateVO.getServiceCategoryName()));
//
//		return new ResponseEntity<>(messageTemplatePortInbound.save(messageTemplateVO), HttpStatus.OK);
//	}
//
//	@PutMapping()
//	public ResponseEntity<?> update(@RequestBody MessageTemplateVO messageTemplateVO, Principal principal) {
//		if (verifyIfIdExists(messageTemplateVO.getId()).getStatus())
//			if (!messageTemplateVO.getStatus() && !messageTemplatePortInbound.existsToInvalidate(messageTemplateVO)) {
//				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//						.body("Não é possível inativar um modelo de resposta ativo único vinculado a uma ação.");
//			}
//
//        try {
//			messageTemplateVO.setServiceCategory(messageTemplatePortInbound.findOneServiceCategory(messageTemplateVO.getServiceCategoryName()));
//            messageTemplatePortInbound.update(messageTemplateVO);
//        } catch (RuntimeException ex) {
//            if(ex.getCause().toString().contains("com.mongodb.DuplicateKeyException")){
//				if (messageTemplatePortInbound.existsToCreate(messageTemplateVO))
//					return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Título ou Messagem já cadastrados.");
//            }else{
//                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                        .body("Ocorreu um erro na atualização!");
//            }
//        }
//
//		return new ResponseEntity<MessageTemplateVO>(HttpStatus.OK);
//	}
//
//	@DeleteMapping("/{id}")
//	public ResponseEntity<?> delete(@PathVariable(value = "id") String id, Principal principal) {
//		verifyIfIdExists(id);
//		messageTemplatePortInbound.delete(id);
//		return ResponseEntity.ok().build();
//	}

//	private MessageTemplateVO verifyIfIdExists(String id) {
//		MessageTemplateVO msTemplateVO = messageTemplatePortInbound.findOne(id);
//		if (msTemplateVO == null)
//			throw new ResourceNotFoundException("ID não encontrado - ID: " + id);
//		return msTemplateVO;
//	}

//    @GetMapping(value = "/download-file", produces = "application/csv")
//    public ResponseEntity<InputStreamResource> downloadCSVFile(Pageable pageable, Principal principal)
//            throws IOException {
//        List<MessageTemplateVO> resultList = messageTemplatePortInbound.findAll(pageable);
//        String file = "C:\\Documents\\my-csv-file.csv";
//        Path path = Paths.get(file);
//        ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
//        return ResponseEntity.ok().header("Content-Disposition", "attachment;filename=\"file.csv\"")
//                .contentLength(resource.contentLength())
//                .contentType(MediaType.parseMediaType("application/octet-stream"))
//                .body(new InputStreamResource(resource.getInputStream()));
//    }
}
