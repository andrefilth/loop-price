package br.com.reclameaqui.pi.mt.adapter.inbound.controller;
//
//
//import br.com.reclameaqui.pi.mt.core.commons.vo.MessageTemplateVO;
//import br.com.reclameaqui.pi.mt.core.commons.vo.ServiceCategoryVO;
//import br.com.reclameaqui.pi.mt.core.port.inbound.MessageTemplatePortInbound;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.BDDMockito;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//
//import static org.assertj.core.api.Assertions.assertThat;
///**
// * @author Eli Gomes on 26/04/18.
// */
//
//@RunWith(SpringRunner.class)
public class MessageTemplateControllerTest {}
//
//    @MockBean
//    MessageTemplatePortInbound messageTemplatePortInbound;
//
//    @Before
//    public void setup() {
//        MessageTemplateVO messageTemplateVO = new MessageTemplateVO();
//        messageTemplateVO.setId("10");
//        messageTemplateVO.setTitle("Teste Titulo");
//        messageTemplateVO.setDescription("Test Descrição");
//        messageTemplateVO.setColor("#FFFF");
//        messageTemplateVO.setStatus(true);
//        ServiceCategoryVO serviceCategoryVO = new ServiceCategoryVO();
//        serviceCategoryVO.setCode("01");
//        serviceCategoryVO.setCodeRA(1);
//        serviceCategoryVO.setName("Categori 01");
//        messageTemplateVO.setServiceCategoryVO(serviceCategoryVO);
//        BDDMockito.when(messageTemplatePortInbound.findOne(messageTemplateVO.getId())).thenReturn(messageTemplateVO);
//    }
//
//    //@Test
//    public void getAll() { }
//
//    @Test
//    public void getById() {
//        assertThat(messageTemplatePortInbound.findOne("10")).isNotNull();
//    }
//
//    @Test
//    public void saveOrUpadate() {
//        MessageTemplateVO messageTemplateVO = new MessageTemplateVO();
//        messageTemplateVO.setId("2");
//        messageTemplateVO.setTitle("Teste Titulo");
//        messageTemplateVO.setDescription("Test Descrição");
//        messageTemplateVO.setColor("#FFFF");
//        messageTemplateVO.setStatus(true);
//        this.messageTemplatePortInbound.save(messageTemplateVO);
//
//        assertThat(messageTemplateVO.getId()).isNotNull();
//        assertThat(messageTemplateVO.getTitle()).isEqualTo("Teste Titulo");
//        assertThat(messageTemplateVO.getDescription()).isEqualTo("Test Descrição");
//    }
//
//    @Test
//    public void update() {
//
//        MessageTemplateVO messageTemplateVO = new MessageTemplateVO();
//        messageTemplateVO.setId("12");
//        messageTemplateVO.setTitle("Teste Titulo");
//        messageTemplateVO.setDescription("Test Descrição");
//        messageTemplateVO.setColor("#FFFF");
//        messageTemplateVO.setStatus(true);
//        messageTemplatePortInbound.save(messageTemplateVO);
//
//        messageTemplateVO.setId("12");
//        messageTemplateVO.setTitle("Teste Titulo Editado");
//        messageTemplateVO.setDescription("Test Descrição Editado");
//        messageTemplateVO.setColor("#FFFF");
//        messageTemplateVO.setStatus(true);
//        messageTemplatePortInbound.save(messageTemplateVO);
//
//        assertThat(messageTemplatePortInbound.findOne(messageTemplateVO.getId())).isNull();
//        assertThat(messageTemplateVO.getTitle()).isEqualTo("Teste Titulo Editado");
//        assertThat(messageTemplateVO.getDescription()).isEqualTo("Test Descrição Editado");
//    }
//
//    @Test
//    public void delete() {
//        MessageTemplateVO messageTemplateVO = new MessageTemplateVO();
//        messageTemplateVO.setId("1");
//        messageTemplateVO.setTitle("Teste Titulo");
//        messageTemplateVO.setDescription("Test Descrição");
//        messageTemplateVO.setColor("#FFFF");
//        messageTemplateVO.setStatus(true);
//        ServiceCategoryVO serviceCategoryVO = new ServiceCategoryVO();
//        serviceCategoryVO.setCode("01");
//        serviceCategoryVO.setCodeRA(1);
//        serviceCategoryVO.setName("Categori 01");
//        messageTemplateVO.setServiceCategoryVO(serviceCategoryVO);
//        messageTemplatePortInbound.save(messageTemplateVO);
//        messageTemplatePortInbound.delete(messageTemplateVO.getId());
//        assertThat(messageTemplatePortInbound.findOne(messageTemplateVO.getId())).isNull();
//    }
//}