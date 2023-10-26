package br.com.bb.amb.constantes;

import java.nio.charset.Charset;



/**
 * Classe de Constantes do Sistema
 * 
 * @author c1260311
 */
public final class SadcConstantes {

	private SadcConstantes() {
	}
	

	public static final String ADMIN = "admin";
	public static final String RELOAD_PAGINA = "reloadPagina();";
	public static final String ID_OUTPUT_TEXT_ACE = "ID_OUTPUT_TEXT_ACE";
	public static final String TIMEZONE = "GMT-3";
	public static final Integer TEMPORIZADOR_DIV = 8000;
	public static final Integer TEMPORIZADOR_DIV_15 = 15000;
	public static final int TAMANHO_CODIGO_REGISTRO_DOC_ALTERACAO = 14;
	public static final int PORTA_OITENTA = 80;
	public static final int TAMANHO_MAX_MATERIAL_LEGADO = 2;
	public static final int TAMANHO_MAX_ACE_LEGADO = 3;
	public static final int DIGITO_ZERO = 0;
	public static final int DIGITO_UM = 1;
	public static final int DIGITO_DOIS = 2;
	public static final int DIGITO_TRES = 3;
	public static final int DIGITO_QUATRO = 4;
	public static final int DIGITO_CINCO = 5;
	public static final int DIGITO_SEIS = 6;
	public static final int DIGITO_SETE = 7;
	public static final int DIGITO_OITO = 8;
	public static final int DIGITO_NOVE = 9;
	public static final int DIGITO_DEZ = 10;
	public static final int DIGITO_ONZE = 11;
	public static final int DIGITO_OITO_MIL = 8000;
	public static final String SISTEMA = "SISTEMA";

	
	public static final String PAGINA_ERROR = "/paginas/error/error.xhtml";
	public static final String CAMINHO_LOCAL_REPORT = "/kdi/workspace/amb-sadc-api/src/main/"
			+ "resources/META-INF/resources/relatorio/rel_acesso.jasper";
	public static final String CAMINHO_LOCAL_LOGO_BB ="/kdi/workspace/amb-sadc-api/src/main/"
		+ "resources/META-INF/resources/css/images/bancodobrasil.png";

	public static final String PREFIXO_REL_ACESSO = "rel_acesso_";
	
	public static final String CAMINHO_RELATORIO_BB_S3 = "reports/";
	public static final String NOME_RELATORIO_BB_S3 = "rel_acesso.jasper";
	
	public static final String CAMINHO_LOGO_BB_S3 = "reports/";
	public static final String NOME_LOGO_BB_S3 = "bancodobrasil.png";
	/**
	 * 15 megas
	 * */
	public static final Long TAMANHO_UPLOAD_ARQUIVO = 15000000L;
	public static final Integer TAMANHO_NOME_ARQUIVO = 50;

	public static final String SADC_DATA_SOURCE_BEAN = "dataSourceSadc";
	public static final String P2000_DATA_SOURCE_BEAN = "dataSourceP2000";
	public static final String CRM_DATA_SOURCE_BEAN = "dataSourceCRM";
	public static final String SADC_PACKAGE_TO_SCAN = "br.com.bb.amb.sadc.modelo.entidade";
	public static final String P2000_PACKAGE_TO_SCAN = "br.com.bb.amb.sadc.modelo.entidade";
	public static final String CRM_PACKAGE_TO_SCAN = "br.com.bb.amb.sadc.modelo.entidade";

	/**
	 * Mensagens de erro e sucesso do SADC
	 */
	public static final String MSG_SUCESSO = "Sucesso";
	public static final String MSG_ERRO = "Erro";
	public static final String MENSAGEM_ERRO_SUPORTE = "Favor Contatar Suporte do Sistema";

	public static final String MSG_0001 = "Login Efetuado.";
	public static final String MSG_0002 = "Erro ao efetuar o login.";
	public static final String MSG_0003 = "Falha na autenticação, verifique sua chave ou senha";
	public static final String MSG_0004 = "Configuração Menu Básico Realizada.";
	public static final String MSG_0005 = "Acesso Registrado.";
	public static final String MSG_0006 = "Configuração Objeto Formulário Realizada.";
	public static final String MSG_0007 = "Item Menu Cadastrado.";
	public static final String MSG_0008 = "Módulo Menu Cadastrado.";
	public static final String MSG_0009 = "Item Menu Excluído.";
	public static final String MSG_0010 = "Formulário Cadastrado.";
	public static final String MSG_0011 = "Já existe um Formulário Vinculado para esse Menu, deseja alterá-lo";
	public static final String MSG_0012 = "Formulário menu Alterado.";
	public static final String MSG_0013 = "Formulário menu Cadastrado.";
	public static final String MSG_0014 = "Acesso Editado.";
	public static final String MENSAGEM_DOCUMENTO_STATUS_INVALIDO = "Documento com Status Inválido";
	public static final String MENSAGEM_DOCUMENTO_NAO_ENCONTRADO = "Documento não encontrado";
	public static final String MENSAGEM_ERRO_RECUPERAR_DOCUMENTO = "Erro ao recuperar documento";
	public static final String MENSAGEM_AVISO_OBJETO_FORMULARIO_EXISTENTE = "Objeto Formulário já existe";
	public static final String MENSAGEM_SUCESSO_SALA_CADASTRADA = "Sala Cadastrada";
	public static final String MENSAGEM_SUCESSO_COMPLEXO_CADASTRADO = "Complexo Cadastrado";
	public static final String MENSAGEM_SUCESSO_CATEGORIA_CADASTRADO = "Categoria Cadastrada";
	public static final String MENSAGEM_ALTERADO = "Alterado(a)";
	public static final String MENSAGEM_ACESSO = "Solicitação de Acesso";
	public static final String MENSAGEM_ACESSO_PENDENCIA = "Pendência Solicitação de Acesso";
	public static final String MENSAGEM_ERRO_CADASTRAR_ACESSO = "Erro ao cadastrar solicitação de acesso";
	public static final String MENSAGEM_ERRO_WEB_SERVICES = "Erro ao Acessar o WebServices GSTI";
	public static final String MENSAGEM_STATUS = "Status";
	public static final String MENSAGEM_AVISO = "Aviso";
	public static final String MENSAGEM_ACESSO_GERADA_SUCESSO = "cadastrada com sucesso";
	public static final String MENSAGEM_ACESSO_AUTORIZADA_SUCESSO = "autorizada com sucesso";
	public static final String MENSAGEM_ACESSO_RECUSADA_SUCESSO = "recusada com sucesso";
	public static final String MENSAGEM_ACESSO_CONCLUIDA_SUCESSO = "concluída com sucesso";
	public static final String MENSAGEM_ACESSO_ALTERADO_SUCESSO = "alterada(o) com sucesso";
	public static final String MENSAGEM_ACESSO_CREDENCIADO_SUCESSO = "credenciado(s) com sucesso";
	public static final String MENSAGEM_TAREFA_VENCIDA = "Tarefa Vencida ou com prazo final inferior ";
	public static final String MENSAGEM_MATERIAL_HOSTNAME = "Material com hostname já exitente";
	public static final String MENSAGEM_ACESSO_NAO_CREDENCIADO = "Nenhum visitante selecionado para o credenciamento";
	public static final String MENSAGEM_INVALIDO = "inválido";
	public static final String MENSAGEM_DIRETORIO_INVALIDO = "Informe o diretório";
	public static final String MENSAGEM_ERRO_DATA_INVALIDA_ATUALIZACAO = "Data Vencida";

	public static final String MENSAGEM_ITEM_MATERIAL_EDITADO = "Item do Material Editado.";

	
	/**
	 * constantes de parametros passados or request
	 */
	public static final String PARAMETRO_REQUEST_LDAP_USUARIO_CHAVE = "PARAMETRO_REQUEST_LDAP_USUARIO_CHAVE";
	public static final String PARAMETRO_REQUEST_ID_ACESSO = "PARAMETRO_REQUEST_ID_ACESSO";
	public static final String PARAMETRO_REQUEST_ID_COMPLEXO = "PARAMETRO_REQUEST_ID_COMPLEXO";
	public static final String PARAMETRO_REQUEST_OBJETO_FORMULARIO = "PARAMETRO_REQUEST_OBJETO_FORMULARIO";
	public static final String PARAMETRO_REQUEST_MENU = "PARAMETRO_REQUEST_MENU";
	public static final String PARAMETRO_REQUEST_MODELO = "PARAMETRO_REQUEST_MODELO";
	public static final String PARAMETRO_REQUEST_VALIDO = "PARAMETRO_REQUEST_VALIDO";
	public static final String PARAMETRO_REQUEST_PAGINA_MENU = "PARAMETRO_REQUEST_PAGINA_MENU";
	public static final String PARAMETRO_REQUEST_PAGINA_CORRENTE = "PARAMETRO_REQUEST_PAGINA_CORRENTE";

	public static final String PARAMETRO_REQUEST_PAGINA_VOLTAR = "PARAMETRO_REQUEST_PAGINA_VOLTAR";
	public static final String PARAMETRO_COMPONENTE_GRUPO_ACESSO_AUTO_COMPLETE = "PARAMETRO_COMPONENTE_GRUPO_ACESSO_AUTO_COMPLETE";
	public static final String PARAMETRO_SADC_MENU = "PARAMETRO_SADC_MENU";

	public static final String PARAMETRO_REQUEST_SADC_LEGADO = "PARAMETRO_REQUEST_SADC_LEGADO";

	public static final String PARAMETRO_REQUEST_MATERIAL_LEGADO = "PARAMETRO_REQUEST_MATERIAL_LEGADO";

	public static final String PARAMETRO_REQUEST_ID_SADC = "SadcAcesso";

	/**
	 * GSTI Web Services
	 */
	public static final String WEB_SERVICES_GSTI_LOGIN = "sadc";
	public static final String WEB_SERVICES_GSTI_SENHA = "#teste#123";
	public static final String WEB_SERVICES_GSTI_URL = "http://integracoesgsti.servicos.bb.com.br:13099/SM/7/SADC.wsdl";
	public static final String WEB_SERVICES_GSTI_URL_HOMOLOGACAO = "http://integracoesgsti.hm.bb.com.br:13086/SM/7/SADC.wsdl";
	public static final String WEB_SERVICES_MSG_SUCCESS = "SUCCESS";

	/**
	 * redirect das paginas do SADC
	 */
	public static final String PAGINA_LOGIN = "/PAGINASadcLogin.xhtml";
	public static final String PAGINA_PRINCIPAL = "/index.xhtml";

	public static final String COMPONENTE_SCHEDULE = "/xhtml/componente/COMPONENTESadcSchedule.xhtml";

	/**
	 * Componentes do SadcAcesso.java
	 */
	public static final String COMPONENTE_ACESSO_CHAVE_INPUT_FIELD = 
			"/xhtml/componente/acesso/inputField/COMPONENTE_ACESSO_CHAVE_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_ACESSO_NOME_INPUT_FIELD = 
			"/xhtml/componente/acesso/inputField/COMPONENTE_ACESSO_NOME_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_ACESSO_EQUIPE_INPUT_FIELD = 
			"/xhtml/componente/acesso/inputField/COMPONENTE_ACESSO_EQUIPE_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_ACESSO_TELEFONE_INPUT_FIELD = 
			"/xhtml/componente/acesso/inputField/COMPONENTE_ACESSO_TELEFONE_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_ACESSO_JUSTIFICATIVA_INPUT_TEXT_AREA = 
			"/xhtml/componente/acesso/inputTextArea/COMPONENTE_ACESSO_JUSTIFICATIVA_INPUT_TEXT_AREA.xhtml";
	public static final String COMPONENTE_ACESSO_JUSTIFICATIVA_READ_ONLY_INPUT_TEXT_AREA = 
			"/xhtml/componente/acesso/inputTextArea/COMPONENTE_ACESSO_JUSTIFICATIVA_READ_ONLY_INPUT_TEXT_AREA.xhtml";
	public static final String COMPONENTE_ACESSO_TEXTO_VISITANTE_TECNOTOUR_INPUT_TEXT_AREA = 
			"/xhtml/componente/acesso/inputTextArea/COMPONENTE_ACESSO_TEXTO_VISITANTE_TECNOTOUR_INPUT_TEXT_AREA.xhtml";
	public static final String COMPONENTE_ACESSO_DATA_INICIO_CALENDAR = 
			"/xhtml/componente/acesso/calendar/COMPONENTE_ACESSO_DATA_INICIO_CALENDAR.xhtml";
	public static final String COMPONENTE_ACESSO_DATA_INICIO_PESQUISA_CALENDAR = 
			"/xhtml/componente/acesso/calendar/COMPONENTE_ACESSO_DATA_INICIO_PESQUISA_CALENDAR.xhtml";
	public static final String COMPONENTE_ACESSO_DATA_INICIO_TIME_PICKER = 
			"/xhtml/componente/acesso/timePicker/COMPONENTE_ACESSO_DATA_INICIO_TIME_PICKER.xhtml";
	public static final String COMPONENTE_ACESSO_DATA_FIM_CALENDAR = 
			"/xhtml/componente/acesso/calendar/COMPONENTE_ACESSO_DATA_FIM_CALENDAR.xhtml";
	public static final String COMPONENTE_ACESSO_DATA_FIM_PESQUISA_CALENDAR = 
			"/xhtml/componente/acesso/calendar/COMPONENTE_ACESSO_DATA_FIM_PESQUISA_CALENDAR.xhtml";
	public static final String COMPONENTE_ACESSO_DATA_FIM_TIME_PICKER = 
			"/xhtml/componente/acesso/timePicker/COMPONENTE_ACESSO_DATA_FIM_TIME_PICKER.xhtml";
	public static final String COMPONENTE_ACESSO_DATA_INICIO_OUTPUT_TEXT = 
			"/xhtml/componente/acesso/outputText/COMPONENTE_ACESSO_DATA_INICIO_OUTPUT_TEXT.xhtml";
	public static final String COMPONENTE_ACESSO_DATA_FIM_OUTPUT_TEXT = 
			"/xhtml/componente/acesso/outputText/COMPONENTE_ACESSO_DATA_FIM_OUTPUT_TEXT.xhtml";
	public static final String COMPONENTE_ACESSO_PESQUISAR_DOCUMENTO_COMMAND_BUTTON = 
			"/xhtml/componente/acesso/commandButton/COMPONENTE_ACESSO_PESQUISAR_DOCUMENTO_COMMAND_BUTTON.xhtml";
	public static final String COMPONENTE_ACESSO_TITULO_DOCUMENTO_INPUT_FIELD = 
			"/xhtml/componente/acesso/inputField/COMPONENTE_ACESSO_TITULO_DOCUMENTO_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_ACESSO_DESCRICAO_DOCUMENTO_INPUT_TEXT_AREA = 
			"/xhtml/componente/acesso/inputTextArea/COMPONENTE_ACESSO_DESCRICAO_DOCUMENTO_INPUT_TEXT_AREA.xhtml";
	public static final String COMPONENTE_ACESSO_EQUIPE_EXECUTORA_INPUT_FIELD = 
			"/xhtml/componente/acesso/inputField/COMPONENTE_ACESSO_EQUIPE_EXECUTORA_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_ACESSO_CHAVE_ANALISTA_RESPONSAVEL_INPUT_FIELD = 
			"/xhtml/componente/acesso/inputField/COMPONENTE_ACESSO_CHAVE_ANALISTA_RESPONSAVEL_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_ACESSO_NOME_ANALISTA_RESPONSAVEL_INPUT_FIELD = 
			"/xhtml/componente/acesso/inputField/COMPONENTE_ACESSO_NOME_ANALISTA_RESPONSAVEL_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_ACESSO_TELEFONE_ANALISTA_RESPONSAVEL_INPUT_FIELD = 
			"/xhtml/componente/acesso/inputField/COMPONENTE_ACESSO_TELEFONE_ANALISTA_RESPONSAVEL_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_ACESSO_PESQUISAR_DOCUMENTO_COMMAND_LINK = 
			"/xhtml/componente/acesso/commandLink/COMPONENTE_ACESSO_PESQUISAR_DOCUMENTO_COMMAND_LINK.xhtml";
	public static final String COMPONENTE_ACESSO_INPUT_MASK = 
			"/xhtml/componente/acesso/inputMask/COMPONENTE_ACESSO_INPUT_MASK.xhtml";
	public static final String COMPONENTE_ACESSO_PESQUISA_INPUT_MASK = 
			"/xhtml/componente/acesso/inputMask/COMPONENTE_ACESSO_PESQUISA_INPUT_MASK.xhtml";

	public static final String COMPONENTE_ACESSO_LAZY_DATA_TABLE = 
			"/xhtml/componente/acesso/dataTable/COMPONENTE_ACESSO_LAZY_DATA_TABLE.xhtml";
	public static final String COMPONENTE_ACESSO_PESQUISAR_COMMAND_BUTTON = 
			"/xhtml/componente/acesso/commandButton/COMPONENTE_ACESSO_PESQUISAR_COMMAND_BUTTON.xhtml";
	public static final String COMPONENTE_ACESSO_DETALHAR_COMMAND_LINK = 
			"/xhtml/componente/acesso/commandLink/COMPONENTE_ACESSO_DETALHAR_COMMAND_LINK.xhtml";
	public static final String COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DIALOG = 
			"/xhtml/componente/acesso/dialog/COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DIALOG.xhtml";
	public static final String COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DETALHE_DIALOG = 
			"/xhtml/componente/acesso/dialog/COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DETALHE_DIALOG.xhtml";
	public static final String COMPONENTE_ACESSO_DETALHE_DATA_TABLE = 
			"/xhtml/componente/acesso/dataTable/COMPONENTE_ACESSO_DETALHE_DATA_TABLE.xhtml";
	public static final String COMPONENTE_ACESSO_DETALHE_MONITORACAO_DATA_TABLE = 
			"/xhtml/componente/acesso/dataTable/COMPONENTE_ACESSO_DETALHE_MONITORACAO_DATA_TABLE.xhtml";
	public static final String COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DETALHE_DATA_TABLE = 
			"/xhtml/componente/acesso/dataTable/COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DETALHE_DATA_TABLE.xhtml";
	public static final String COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_PENDENCIA_DIALOG = 
			"/xhtml/componente/acesso/dialog/COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_PENDENCIA_DIALOG.xhtml";
	public static final String COMPONENTE_ACESSO_DOCUMENTO_INPUT_MASK = 
			"/xhtml/componente/acesso/inputMask/COMPONENTE_ACESSO_DOCUMENTO_INPUT_MASK.xhtml";
	public static final String COMPONENTE_ACESSO_JUSTIFICATIVA_OUTPUT_LABEL = 
			"/xhtml/componente/acesso/outputLabel/COMPONENTE_ACESSO_JUSTIFICATIVA_OUTPUT_LABEL.xhtml";
	public static final String COMPONENTE_ACESSO_LIMPAR_DOCUMENTO_COMMAND_LINK = 
			"/xhtml/componente/acesso/commandLink/COMPONENTE_ACESSO_LIMPAR_DOCUMENTO_COMMAND_LINK.xhtml";
	public static final String COMPONENTE_ACESSO_DOCUMENTO_SELECT_ONE_RADIO = 
			"/xhtml/componente/acesso/selectOneRadio/COMPONENTE_ACESSO_DOCUMENTO_SELECT_ONE_RADIO.xhtml";
	public static final String COMPONENTE_ACESSO_CREDENCIAR_DIALOG = 
			"/xhtml/componente/acesso/dialog/COMPONENTE_ACESSO_CREDENCIAR_DIALOG.xhtml";

	/**
	 * Componentes do SadcLegadoAcesso.java
	 */
	public static final String COMPONENTE_ACESSO_LEGADO_DATA_TABLE = 
			"/xhtml/componenteLegado/acessoLegado/dataTable/COMPONENTE_ACESSO_LEGADO_DATA_TABLE.xhtml";
	public static final String COMPONENTE_ACESSO_LEGADO_INPUT_TEXT = 
			"/xhtml/componenteLegado/acessoLegado/inputText/COMPONENTE_ACESSO_LEGADO_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_ACESSO_DOCUMENTOBB_LEGADO_INPUT_TEXT = 
			"/xhtml/componenteLegado/acessoLegado/inputText/COMPONENTE_ACESSO_DOCUMENTOBB_LEGADO_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_ACESSO_DOC_VISITANTE_LEGADO_INPUT_TEXT = 
			"/xhtml/componenteLegado/acessoLegado/inputText/COMPONENTE_ACESSO_DOC_VISITANTE_LEGADO_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_ACESSO_VISITANTE_LEGADO_INPUT_TEXT = 
			"/xhtml/componenteLegado/acessoLegado/inputText/COMPONENTE_ACESSO_VISITANTE_LEGADO_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_ACESSO_AREA_REFERENCIA_LEGADO_SELECT_ONE_MENU = 
			"/xhtml/componenteLegado/acessoLegado/selectOneMenu/COMPONENTE_ACESSO_AREA_REFERENCIA_LEGADO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_ACESSO_COMPLEXO_LEGADO_SELECT_ONE_MENU = 
			"/xhtml/componenteLegado/acessoLegado/selectOneMenu/COMPONENTE_ACESSO_COMPLEXO_LEGADO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_ACESSO_STATUS_ACESSO_LEGADO_SELECT_ONE_MENU = 
			"/xhtml/componenteLegado/acessoLegado/selectOneMenu/COMPONENTE_ACESSO_STATUS_ACESSO_LEGADO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_ACESSO_TIPO_ACESSO_LEGADO_SELECT_ONE_MENU = 
			"/xhtml/componenteLegado/acessoLegado/selectOneMenu/COMPONENTE_ACESSO_TIPO_ACESSO_LEGADO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_ACESSO_DATA_INICIO_CADASTRO_CALENDAR = 
			"/xhtml/componenteLegado/acessoLegado/calendar/COMPONENTE_ACESSO_DATA_INICIO_CADASTRO_CALENDAR.xhtml";
	public static final String COMPONENTE_ACESSO_DATA_FIM_CADASTRO_CALENDAR = 
			"/xhtml/componenteLegado/acessoLegado/calendar/COMPONENTE_ACESSO_DATA_FIM_CADASTRO_CALENDAR.xhtml";
	public static final String COMPONENTE_ACESSO_DATA_INICIO_JANELA_CALENDAR = 
			"/xhtml/componenteLegado/acessoLegado/calendar/COMPONENTE_ACESSO_DATA_INICIO_JANELA_CALENDAR.xhtml";
	public static final String COMPONENTE_ACESSO_DATA_FIM_JANELA_CALENDAR = 
			"/xhtml/componenteLegado/acessoLegado/calendar/COMPONENTE_ACESSO_DATA_FIM_JANELA_CALENDAR.xhtml";
	public static final String COMPONENTE_ACESSO_EMPRESA_LEGADO_INPUT_TEXT = 
			"/xhtml/componenteLegado/acessoLegado/inputText/COMPONENTE_ACESSO_EMPRESA_LEGADO_INPUT_TEXT.xhtml";
	

	/**
	 * Componentes do SadcLegadoMaterial.java
	 */
	public static final String COMPONENTE_MATERIAL_COMPLEXO_LEGADO_SELECT_ONE_MENU = 
			"/xhtml/componenteLegado/materialLegado/selectOneMenu/COMPONENTE_MATERIAL_COMPLEXO_LEGADO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_MATERIAL_LEGADO_DATA_TABLE = 
			"/xhtml/componenteLegado/materialLegado/dataTable/COMPONENTE_MATERIAL_LEGADO_DATA_TABLE.xhtml";
	public static final String COMPONENTE_MAT_LEGADO_NUM_INPUT_TEXT = 
			"/xhtml/componenteLegado/materialLegado/inputText/COMPONENTE_MAT_LEGADO_NUM_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_MAT_LEGADO_NUM_DOCUMENTO_INPUT_TEXT = 
			"/xhtml/componenteLegado/materialLegado/inputText/COMPONENTE_MAT_LEGADO_NUM_DOCUMENTO_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_MAT_LEGADO_VISITANTE_NOME_INPUT_TEXT = 
			"/xhtml/componenteLegado/materialLegado/inputText/COMPONENTE_MAT_LEGADO_VISITANTE_NOME_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_MAT_LEGADO_VISITANTE_DOC_INPUT_TEXT = 
			"/xhtml/componenteLegado/materialLegado/inputText/COMPONENTE_MAT_LEGADO_VISITANTE_DOC_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_MATERIAL_STATUS_ACESSO_LEGADO_SELECT_ONE_MENU = 
			"/xhtml/componenteLegado/materialLegado/selectOneMenu/COMPONENTE_MATERIAL_STATUS_ACESSO_LEGADO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_MATERIAL_LEGADO_DATA_FIM_CADASTRO_CALENDAR = 
			"/xhtml/componenteLegado/materialLegado/calendar/COMPONENTE_MATERIAL_LEGADO_DATA_FIM_CADASTRO_CALENDAR.xhtml";
	public static final String COMPONENTE_MATERIAL_LEGADO_DATA_FIM_JANELA_CALENDAR = 
			"/xhtml/componenteLegado/materialLegado/calendar/COMPONENTE_MATERIAL_LEGADO_DATA_FIM_JANELA_CALENDAR.xhtml";
	public static final String COMPONENTE_MATERIAL_LEGADO_DATA_INICIO_CADASTRO_CALENDAR = 
			"/xhtml/componenteLegado/materialLegado/calendar/COMPONENTE_MATERIAL_LEGADO_DATA_INICIO_CADASTRO_CALENDAR.xhtml";
	public static final String COMPONENTE_MATERIAL_LEGADO_DATA_INICIO_JANELA_CALENDAR = 
			"/xhtml/componenteLegado/materialLegado/calendar/COMPONENTE_MATERIAL_LEGADO_DATA_INICIO_JANELA_CALENDAR.xhtml";

	/**
	 * Componentes SadcIncidenteSeguranca.java
	 */
	public static final String COMPONENTE_INCIDENTE_SEGURANCA_DATA_OCORRENCIA_CALENDAR = 
			"/xhtml/componente/incidenteSeguranca/calendar/COMPONENTE_INCIDENTE_SEGURANCA_DATA_OCORRENCIA_CALENDAR.xhtml";
	public static final String COMPONENTE_INCIDENTE_SEGURANCA_AREA_OCORRENCIA_INPUT_TEXT_AREA = 
			"/xhtml/componente/incidenteSeguranca/inputTextArea/COMPONENTE_INCIDENTE_SEGURANCA_AREA_OCORRENCIA_INPUT_TEXT_AREA.xhtml";
	public static final String COMPONENTE_INCIDENTE_SEGURANCA_AREA_ATINGIDA_INPUT_TEXT_AREA = 
			"/xhtml/componente/incidenteSeguranca/inputTextArea/COMPONENTE_INCIDENTE_SEGURANCA_AREA_ATINGIDA_INPUT_TEXT_AREA.xhtml";
	public static final String COMPONENTE_INCIDENTE_SEGURANCA_ENVOLVIDOS_INPUT_TEXT_AREA = 
			"/xhtml/componente/incidenteSeguranca/inputTextArea/COMPONENTE_INCIDENTE_SEGURANCA_ENVOLVIDOS_INPUT_TEXT_AREA.xhtml";
	public static final String COMPONENTE_INCIDENTE_SEGURANCA_TIPO_SELECT_ONE_MENU = 
			"/xhtml/componente/incidenteSeguranca/selectOneMenu/COMPONENTE_INCIDENTE_SEGURANCA_TIPO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_INCIDENTE_SEGURANCA_ACESSO_AUTO_COMPLETE = 
			"/xhtml/componente/incidenteSeguranca/autoComplete/COMPONENTE_INCIDENTE_SEGURANCA_ACESSO_AUTO_COMPLETE.xhtml";
	public static final String COMPONENTE_INCIDENTE_SEGURANCA_NIVEL_IMPACTO_SELECT_ONE_MENU = 
			"/xhtml/componente/incidenteSeguranca/selectOneMenu/COMPONENTE_INCIDENTE_SEGURANCA_NIVEL_IMPACTO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_INCIDENTE_SEGURANCA_DATA_OCORRENCIA_FIM_CALENDAR = 
			"/xhtml/componente/incidenteSeguranca/calendar/COMPONENTE_INCIDENTE_SEGURANCA_DATA_OCORRENCIA_FIM_CALENDAR.xhtml";
	public static final String COMPONENTE_INCIDENTE_SEGURANCA_DATA_OCORRENCIA_INICIO_CALENDAR = 
			"/xhtml/componente/incidenteSeguranca/calendar/COMPONENTE_INCIDENTE_SEGURANCA_DATA_OCORRENCIA_INICIO_CALENDAR.xhtml";
	public static final String COMPONENTE_INCIDENTE_SEGURANCA_NIVEL_IMPACTO_SELECT_MANY_CHECK_BOX = 
			"/xhtml/componente/incidenteSeguranca/selectManyCheckBox/COMPONENTE_INCIDENTE_SEGURANCA_NIVEL_IMPACTO_SELECT_MANY_CHECK_BOX.xhtml";
	public static final String COMPONENTE_INCIDENTE_SEGURANCA_DATA_TABLE = 
			"/xhtml/componente/incidenteSeguranca/dataTable/COMPONENTE_INCIDENTE_SEGURANCA_DATA_TABLE.xhtml";
	public static final String COMPONENTE_INCIDENTE_SEGURANCA_DETALHAR_COMMAND_LINK = 
			"/xhtml/componente/incidenteSeguranca/commandLink/COMPONENTE_INCIDENTE_SEGURANCA_DETALHAR_COMMAND_LINK.xhtml";
	/**
	 * Componentes SadcTipoIncidenteSeguranca.java
	 */
	public static final String COMPONENTE_TIPO_INCIDENTE_SEGURANCA_SELECT_ONE_MENU = 
			"/xhtml/componente/incidenteSegurancaTipo/selectOneMenu/COMPONENTE_TIPO_INCIDENTE_SEGURANCA_SELECT_ONE_MENU.xhtml";

	/**
	 * Componentes de SadcAtualizacaoAcesso.java
	 */
	public static final String COMPONENTE_ATUALIZACAO_ACESSO_ANOTACAO_INPUT_TEXT_AREA = 
			"/xhtml/componente/atualizacaoAcesso/inputTextArea/COMPONENTE_ATUALIZACAO_ACESSO_ANOTACAO_INPUT_TEXT_AREA.xhtml";
	public static final String COMPONENTE_ATUALIZACAO_ACESSO_DATA_TABLE = 
			"/xhtml/componente/atualizacaoAcesso/dataTable/COMPONENTE_ATUALIZACAO_ACESSO_DATA_TABLE.xhtml";
	public static final String COMPONENTE_ATUALIZACAO_ACESSO_SALVAR_DIALOG = 
			"/xhtml/componente/atualizacaoAcesso/dialog/COMPONENTE_ATUALIZACAO_ACESSO_SALVAR_DIALOG.xhtml";
	public static final String COMPONENTE_ATUALIZACAO_ACESSO_INCLUIR_COMMAND_BUTTON = 
			"/xhtml/componente/atualizacaoAcesso/commandButton/COMPONENTE_ATUALIZACAO_ACESSO_INCLUIR_COMMAND_BUTTON.xhtml";

	/**
	 * Componentes SadcTipoAcesso.java
	 */
	public static final String COMPONENTE_TIPO_ACESSO_OUTPUT_TEXT = 
			"/xhtml/componente/tipoAcesso/outputText/COMPONENTE_TIPO_ACESSO_OUTPUT_TEXT.xhtml";
	public static final String COMPONENTE_TIPO_ACESSO_INPUT_FIELD = 
			"/xhtml/componente/tipoAcesso/inputField/COMPONENTE_TIPO_ACESSO_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_TIPO_ACESSO_SELECT_ONE_MENU = 
			"/xhtml/componente/tipoAcesso/selectOneMenu/COMPONENTE_TIPO_ACESSO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_TIPO_ACESSO_DESCRICAO_MANY_CHECK_BOX = 
			"/xhtml/componente/tipoAcesso/selectManyCheckBox/COMPONENTE_TIPO_ACESSO_DESCRICAO_MANY_CHECK_BOX.xhtml";
	public static final String COMPONENTE_TIPO_ACESSO_DESCRICAO_MANY_MENU = 
			"/xhtml/componente/tipoAcesso/selectManyMenu/COMPONENTE_TIPO_ACESSO_DESCRICAO_MANY_MENU.xhtml";
	public static final String COMPONENTE_TIPO_ACESSO_DATA_TABLE = 
			"/xhtml/componente/tipoAcesso/dataTable/COMPONENTE_TIPO_ACESSO_DATA_TABLE.xhtml";
	/**
	 * Componentes SadcTipoOrdinario.java
	 */
	public static final String COMPONENTE_ACESSO_ORDINARIO_DESCRICAO_SELECT_ONE_MENU = 
			"/xhtml/componente/acesso/selectOneMenu/COMPONENTE_ACESSO_ORDINARIO_DESCRICAO_SELECT_ONE_MENU.xhtml";

	/**
	 * Componentes SadcUsuario.java
	 */
	
	public static final String COMPONENTE_USUARIO_EMPRESA_MONITORACAO_INPUT_FIELD = 
			"/xhtml/componente/usuario/inputField/COMPONENTE_USUARIO_EMPRESA_MONITORACAO_INPUT_FIELD.xhtml";
	
	public static final String COMPONENTE_USUARIO_NOME_MONITORACAO_INPUT_FIELD =
			"/xhtml/componente/usuario/inputField/COMPONENTE_USUARIO_NOME_MONITORACAO_INPUT_FIELD.xhtml";
	
	public static final String COMPONENTE_USUARIO_NUMERO_DOCUMENTO_MONITORACAO_INPUT_FIELD =
			"/xhtml/componente/usuario/inputField/COMPONENTE_USUARIO_NUMERO_DOCUMENTO_MONITORACAO_INPUT_FIELD.xhtml";
	
	public static final String COMPONENTE_USUARIO_NUMERO_DOCUMENTO_INPUT_FIELD = 
			"/xhtml/componente/usuario/inputField/COMPONENTE_USUARIO_NUMERO_DOCUMENTO_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_USUARIO_NOME_DOCUMENTO_INPUT_FIELD = 
			"/xhtml/componente/usuario/inputField/COMPONENTE_USUARIO_NOME_DOCUMENTO_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_USUARIO_LOGADO_INCLUIR_COMMAND_BUTTON = 
			"/xhtml/componente/usuario/commandButton/COMPONENTE_USUARIO_LOGADO_INCLUIR_COMMAND_BUTTON.xhtml";
	public static final String COMPONENTE_USUARIO_INCLUIR_COMMAND_BUTTON = 
			"/xhtml/componente/usuario/commandButton/COMPONENTE_USUARIO_INCLUIR_COMMAND_BUTTON.xhtml";
	public static final String COMPONENTE_USUARIO_DATA_TABLE = 
			"/xhtml/componente/usuario/dataTable/COMPONENTE_USUARIO_DATA_TABLE.xhtml";
	public static final String COMPONENTE_USUARIO_EMPRESA_INPUT_FIELD = 
			"/xhtml/componente/usuario/inputField/COMPONENTE_USUARIO_EMPRESA_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_USUARIO_DATA_TABLE_RESULTADO = 
			"/xhtml/componente/usuario/dataTable/COMPONENTE_USUARIO_DATA_TABLE_RESULTADO.xhtml";

	/**
	 * Componentes SadLdapcUsuario.java
	 */
	public static final String COMPONENTE_LDAP_USUARIO_CADASTRADO_ACESSO_DATA_TABLE = 
			"/xhtml/componente/ldapUsuario/dataTable/COMPONENTE_LDAP_USUARIO_CADASTRADO_ACESSO_DATA_TABLE.xhtml";
	public static final String COMPONENTE_LDAP_USUARIO_GRUPO_ACESSO_DATA_TABLE = 
			"/xhtml/componente/ldapUsuario/dataTable/COMPONENTE_LDAP_USUARIO_GRUPO_ACESSO_DATA_TABLE.xhtml";
	public static final String COMPONENTE_USUARIO_ADMIN_DATA_TABLE = 
			"/xhtml/componente/usuario/dataTable/COMPONENTE_USUARIO_ADMIN_DATA_TABLE.xhtml";

	/**
	 * Componentes SadcLdapGrupo.java
	 */
	public static final String COMPONENTE_LDAP_GRUPO_SELECT_ONE_MENU = 
			"/xhtml/componente/ldapGrupo/selectOneMenu/COMPONENTE_LDAP_GRUPO_SELECT_ONE_MENU.xhtml";

	/**
	 * Componente SadcUsuarioAcesso
	 */

	public static final String COMPONENTE_USUARIO_ACESSO_NUMERO_DOCUMENTO_INPUT_FIELD = 
			"/xhtml/componente/usuarioAcesso/inputField/COMPONENTE_USUARIO_ACESSO_NUMERO_DOCUMENTO_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_USUARIO_ACESSO_NUMERO_DOCUMENTO_PESQUISA_INPUT_FIELD = 
			"/xhtml/componente/usuarioAcesso/inputField/COMPONENTE_USUARIO_ACESSO_NUMERO_DOCUMENTO_PESQUISA_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_USUARIO_ACESSO_NOME_INPUT_FIELD = 
			"/xhtml/componente/usuarioAcesso/inputField/COMPONENTE_USUARIO_ACESSO_NOME_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_USUARIO_ACESSO_EMPRESA_INPUT_FIELD = 
			"/xhtml/componente/usuarioAcesso/inputField/COMPONENTE_USUARIO_ACESSO_EMPRESA_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_USUARIO_ACESSO_TIPO_DOCUMENTO_SELECT_ONE_RADIO = 
			"/xhtml/componente/usuarioAcesso/selectOneRadio/COMPONENTE_USUARIO_ACESSO_TIPO_DOCUMENTO_SELECT_ONE_RADIO.xhtml";
	public static final String COMPONENTE_USUARIO_ACESSO_TIPO_USUARIO_ENUM_SELECT_ONE_RADIO = 
			"/xhtml/componente/usuarioAcesso/selectOneRadio/COMPONENTE_USUARIO_ACESSO_TIPO_USUARIO_ENUM_SELECT_ONE_RADIO.xhtml";
	public static final String COMPONENTE_USUARIO_ACESSO_INCLUIR_DIALOG = 
			"/xhtml/componente/usuarioAcesso/dialog/COMPONENTE_USUARIO_ACESSO_INCLUIR_DIALOG.xhtml";
	public static final String COMPONENTE_USUARIO_ACESSO_PAIS_AUTO_COMPLETE = 
			"/xhtml/componente/usuarioAcesso/autoComplete/COMPONETE_USUARIO_ACESSO_PAIS_AUTO_COMPLETE.xhtml";
	public static final String COMPONENTE_USUARIO_ACESSO_NOME_EMPRESA_DOCUMENTO_SELECT_ONE_RADIO = 
			"/xhtml/componente/usuarioAcesso/selectOneRadio/COMPONENTE_USUARIO_ACESSO_NOME_EMPRESA_DOCUMENTO_SELECT_ONE_RADIO.xhtml";
	public static final String COMPONENTE_USUARIO_ACESSO_CREDENCIAR_DATA_TABLE = 
			"/xhtml/componente/usuarioAcesso/dataTable/COMPONENTE_USUARIO_ACESSO_CREDENCIAR_DATA_TABLE.xhtml";
	/**
	 * Componentes do SadcMenu.java
	 */
	public static final String COMPONENTE_MENU_INDICADOR_VISUALIZAR_SELECT_ONE_RADIO = 
			"/xhtml/componente/menu/selectOneRadio/COMPONENTE_MENU_INDICADOR_VISUALIZAR_SELECT_ONE_RADIO.xhtml";
	public static final String COMPONENTE_MENU_DESCRICAO_TREE = 
			"/xhtml/componente/menu/tree/COMPONENTE_MENU_DESCRICAO_TREE.xhtml";
	public static final String COMPONENTE_MENU_DESCRICAO_SINGLE_TREE = 
			"/xhtml/componente/menu/tree/COMPONENTE_MENU_DESCRICAO_SINGLE_TREE.xhtml";
	public static final String COMPONENTE_MENU_DESCRICAO_SELECT_ONE_MENU = 
			"/xhtml/componente/menu/selectOneMenu/COMPONENTE_MENU_DESCRICAO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_MENU_NOVO_DIALOG = 
			"/xhtml/componente/menu/dialog/COMPONENTE_MENU_NOVO_DIALOG.xhtml";
	public static final String COMPONENTE_MENU_NOVO_MODULO_DIALOG = 
			"/xhtml/componente/menu/dialog/COMPONENTE_MENU_NOVO_MODULO_DIALOG.xhtml";
	public static final String COMPONENTE_MENU_DESCRICAO_INPUT_FIELD = 
			"/xhtml/componente/menu/inputField/COMPONENTE_MENU_DESCRICAO_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_MENU_NOVO_MODULO_COMMAND_BUTTON = 
			"/xhtml/componente/menu/commandButton/COMPONENTE_MENU_NOVO_MODULO_COMMAND_BUTTON.xhtml";
	public static final String COMPONENTE_MENU_DATA_TABLE = 
			"/xhtml/componente/menu/dataTable/COMPONENTE_MENU_DATA_TABLE.xhtml";
	/**
	 * Componentes do SadcGrupoAcesso.java
	 */
	public static final String COMPONENTE_GRUPO_ACESSO_NOME_AUTO_COMPLETE = 
			"/xhtml/componente/grupoAcesso/autoComplete/COMPONENTE_GRUPO_ACESSO_NOME_AUTO_COMPLETE.xhtml";
	public static final String COMPONENTE_GRUPO_ACESSO_BOOLEAN_CHECK_BOX = 
			"/xhtml/componente/grupoAcesso/booleanCheckBox/COMPONENTE_GRUPO_ACESSO_BOOLEAN_CHECK_BOX.xhtml";
	public static final String COMPONENTE_GRUPO_ACESSO_SIGLA_SELECT_MANY_CHECK_BOX = 
			"/xhtml/componente/grupoAcesso/selectManyCheckBox/COMPONENTE_GRUPO_ACESSO_SIGLA_SELECT_MANY_CHECK_BOX.xhtml";

	/**
	 * Componentes do SadcGrupoAcessoMenu.java
	 */
	public static final String COMPONENTE_GRUPO_ACESSO_MENU_DATA_TABLE = 
			"/xhtml/componente/grupoAcessoMenu/dataTable/COMPONENTE_GRUPO_ACESSO_MENU_DATA_TABLE.xhtml";
	public static final String COMPONENTE_GRUPO_ACESSO_MENU_DESCRICAO_TREE = 
			"/xhtml/componente/grupoAcessoMenu/tree/COMPONENTE_GRUPO_ACESSO_MENU_DESCRICAO_TREE.xhtml";
	/**
	 * Componentes do SadcObjetoFormulario.java
	 */
	public static final String COMPONENTE_OBJETO_FORMULARIO_TEXTO_DESCRICAO_SELECT_ONE_MENU = 
			"/xhtml/componente/objetoFormulario/selectOneMenu/COMPONENTE_OBJETO_FORMULARIO_TEXTO_DESCRICAO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_OBJETO_FORMULARIO_METODOS_ACTION_SADC_CONTROLADOR_SELECT_ONE_MENU = 
			"/xhtml/componente/objetoFormulario/selectOneMenu/COMPONENTE_OBJETO_FORMULARIO_METODOS_ACTION_SADC_CONTROLADOR_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_OBJETO_FORMULARIO_INDICADOR_VISUALIZAR_SELECT_ONE_RADIO = 
			"/xhtml/componente/objetoFormulario/selectOneRadio/COMPONENTE_OBJETO_FORMULARIO_INDICADOR_VISUALIZAR_SELECT_ONE_RADIO.xhtml";
	public static final String COMPONENTE_OBJETO_FORMULARIO_TOOLBAR = 
			"/xhtml/componente/objetoFormulario/toolBar/COMPONENTE_OBJETO_FORMULARIO_TOOLBAR.xhtml";
	public static final String COMPONENTE_OBJETO_FORMULARIO_MENUBAR = 
			"/xhtml/componente/objetoFormulario/menuBar/COMPONENTE_OBJETO_FORMULARIO_MENUBAR.xhtml";
	public static final String COMPONENTE_OBJETO_FORMULARIO_DATA_TABLE = 
			"/xhtml/componente/objetoFormulario/dataTable/COMPONENTE_OBJETO_FORMULARIO_DATA_TABLE.xhtml";

	/**
	 * Componentes do SadcParametroSistema.java
	 */
	public static final String COMPONENTE_PARAMETRO_SISTEMA_DATA_TABLE = 
			"/xhtml/componente/parametroSistema/dataTable/COMPONENTE_PARAMETRO_SISTEMA_DATA_TABLE.xhtml";
	public static final String COMPONENTE_PARAMETRO_SISTEMA_TEXTO_INICIAL_DATAT_ABLE_DIALOG = 
			"/xhtml/componente/parametroSistema/dialog/COMPONENTE_PARAMETRO_SISTEMA_TEXTO_INICIAL_DATAT_ABLE_DIALOG.xhtml";
	public static final String COMPONENTE_PARAMETRO_SISTEMA_TEXTO_INICIAL_TEXT_EDITOR = 
			"/xhtml/componente/parametroSistema/textEditor/COMPONENTE_PARAMETRO_SISTEMA_TEXTO_INICIAL_TEXT_EDITOR.xhtml";
	public static final String COMPONENTE_PARAMETRO_SISTEMA_TEXTO_ROTA_INPUT_TEXT = 
			"/xhtml/componente/parametroSistema/inputText/COMPONENTE_PARAMETRO_SISTEMA_TEXTO_ROTA_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_PARAMETRO_SISTEMA_USUARIO_LDAP_INPUT_TEXT = 
			"/xhtml/componente/parametroSistema/inputText/COMPONENTE_PARAMETRO_SISTEMA_USUARIO_LDAP_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_PARAMETRO_SISTEMA_URL_LDAP_INPUT_TEXT = 
			"/xhtml/componente/parametroSistema/inputText/COMPONENTE_PARAMETRO_SISTEMA_URL_LDAP_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_PARAMETRO_SISTEMA_TEXTO_CAMINHO_SERVIDOR_INPUT_TEXT = 
			"/xhtml/componente/parametroSistema/inputText/COMPONENTE_PARAMETRO_SISTEMA_TEXTO_CAMINHO_SERVIDOR_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_PARAMETRO_SISTEMA_AUTENTICACAO_SENHA_SERVIDOR_INPUT_TEXT = 
			"/xhtml/componente/parametroSistema/inputText/COMPONENTE_PARAMETRO_SISTEMA_AUTENTICACAO_SENHA_SERVIDOR_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_PARAMETRO_SISTEMA_AUTENTICACAO_LOGIN_SERVIDOR_INPUT_TEXT = 
			"/xhtml/componente/parametroSistema/inputText/COMPONENTE_PARAMETRO_SISTEMA_AUTENTICACAO_LOGIN_SERVIDOR_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_PARAMETRO_SENHA_LDAP_INPUT_TEXT = 
			"/xhtml/componente/parametroSistema/inputText/COMPONENTE_PARAMETRO_SENHA_LDAP_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_PARAMETRO_MINUTO_CARENCIA_ACE_INPUT_NUMBER = 
			"/xhtml/componente/parametroSistema/inputNumber/COMPONENTE_PARAMETRO_MINUTO_CARENCIA_ACE_INPUT_NUMBER.xhtml";
	public static final String COMPONENTE_PARAMETRO_TOTAL_HORAS_EXIBIR_BOTAO_INPUT_NUMBER = 
			"/xhtml/componente/parametroSistema/inputNumber/COMPONENTE_PARAMETRO_TOTAL_HORAS_EXIBIR_BOTAO_INPUT_NUMBER.xhtml";
	public static final String COMPONENTE_PARAMETRO_TOTAL_REGISTROS_ACESSOS_POSTERIOR_INPUT_NUMBER = 
			"/xhtml/componente/parametroSistema/inputNumber/COMPONENTE_PARAMETRO_TOTAL_REGISTROS_ACESSOS_POSTERIOR_INPUT_NUMBER.xhtml";
	public static final String COMPONENTE_PARAMETRO_EXECUCAO_ROTINA_INPUT_TEXT = 
			"/xhtml/componente/parametroSistema/inputText/COMPONENTE_PARAMETRO_EXECUCAO_ROTINA_INPUT_TEXT.xhtml";
	/**
	 * Componentes do SadcFormulario.java
	 */
	public static final String COMPONENTE_FORMULARIO_NOME_SELECT_ONE_MENU = 
			"/xhtml/componente/formulario/selectOneMenu/COMPONENTE_FORMULARIO_NOME_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_FORMULARIO_DIRETORIO_SELECT_ONE_MENU = 
			"/xhtml/componente/formulario/selectOneMenu/COMPONENTE_FORMULARIO_DIRETORIO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_FORMULARIO_NOME_INPUT_FIELD = 
			"/xhtml/componente/formulario/inputField/COMPONENTE_FORMULARIO_NOME_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_FORMULARIO_URL_INPUT_FIELD = 
			"/xhtml/componente/formulario/inputField/COMPONENTE_FORMULARIO_URL_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_FORMULARIO_DATA_TABLE = 
			"/xhtml/componente/formulario/dataTable/COMPONENTE_FORMULARIO_DATA_TABLE.xhtml";
	public static final String COMPONENTE_FORMULARIO_LINK_BOOLEAN_CHECK_BOX = 
			"/xhtml/componente/formulario/booleanCheckBox/COMPONENTE_FORMULARIO_LINK_BOOLEAN_CHECK_BOX.xhtml";
	/**
	 * Componentes SadcFormularioMenu.java
	 */
	public static final String COMPONENTE_FORMULARIO_MENU_CONFIRMACAO_DIALOG = 
			"/xhtml/componente/formularioMenu/dialog/COMPONENTE_FORMULARIO_MENU_CONFIRMACAO_DIALOG.xhtml";
	public static final String COMPONENTE_FORMULARIO_MENU_DATA_TABLE = 
			"/xhtml/componente/formularioMenu/dataTable/COMPONENTE_FORMULARIO_MENU_DATA_TABLE.xhtml";
	/**
	 * Componentes do SadcComplexo.java
	 */
	
	public static final String COMPONENTE_COMPLEXO_MONITORACAO_MANY_CHECK_BOX =
			"/xhtml/componente/complexo/selectManyCheckBox/COMPONENTE_COMPLEXO_MONITORACAO_MANY_CHECK_BOX.xhtml";
	
	public static final String COMPONENTE_COMPLEXO_MANY_CHECK_BOX  = 
			"/xhtml/componente/complexo/booleanCheckBox/COMPONENTE_COMPLEXO_MANY_CHECK_BOX.xhtml";
	
	public static final String COMPONENTE_COMPLEXO_SELECT_ONE_MENU = 
			"/xhtml/componente/complexo/selectOneMenu/COMPONENTE_COMPLEXO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_COMPLEXO_MONITORACAO_SELECT_ONE_MENU = 
			"/xhtml/componente/complexo/selectOneMenu/COMPONENTE_COMPLEXO_MONITORACAO_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_COMPLEXO_OUTPUT_LABEL = 
			"/xhtml/componente/complexo/outputLabel/COMPONENTE_COMPLEXO_OUTPUT_LABEL.xhtml";
	public static final String COMPONENTE_COMPLEXO_INPUT_TEXT = 
			"/xhtml/componente/complexo/inputText/COMPONENTE_COMPLEXO_INPUT_TEXT.xhtml";
	public static final String COMPONENTE_COMPLEXO_EDITAR_DATA_TABLE = 
			"/xhtml/componente/complexo/dataTable/COMPONENTE_COMPLEXO_EDITAR_DATA_TABLE.xhtml";
	public static final String COMPONENTE_COMPLEXO_INDICADOR_SELECT_ONE_RADIO = 
			"/xhtml/componente/complexo/selectOneRadio/COMPONENTE_COMPLEXO_INDICADOR_SELECT_ONE_RADIO.xhtml";
	/**
	 * Componentes do SadcAreaComplexo.java
	 */
	public static final String COMPONENTE_AREA_COMPLEXO_SELECT_ONE_MENU = 
			"/xhtml/componente/areaComplexo/selectOneMenu/COMPONENTE_AREA_COMPLEXO_SELECT_ONE_MENU.xhtml";

	/**
	 * Componentes do SadcSala.java
	 */
	public static final String COMPONENTE_SALA_INPUT_FIELD = 
			"/xhtml/componente/sala/inputField/COMPONENTE_SALA_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_SALA_INDICADOR_SELECT_ONE_RADIO = 
			"/xhtml/componente/sala/selectOneRadio/COMPONENTE_SALA_INDICADOR_SELECT_ONE_RADIO.xhtml";
	public static final String COMPONENTE_SALA_EDITAR_DATA_TABLE = 
			"/xhtml/componente/sala/dataTable/COMPONENTE_SALA_EDITAR_DATA_TABLE.xhtml";
	public static final String COMPONENTE_SALA_MANY_CHECK_BOX = 
			"/xhtml/componente/sala/selectManyCheckBox/COMPONENTE_SALA_MANY_CHECK_BOX.xhtml";
	public static final String COMPONENTE_SALA_DATA_LIST = 
			"/xhtml/componente/sala/dataList/COMPONENTE_SALA_DATA_LIST.xhtml";
	public static final String COMPONENTE_SALA_DATA_GRID = 
			"/xhtml/componente/sala/dataGrid/COMPONENTE_SALA_DATA_GRID.xhtml";
	/**
	 * Componentes do SadcSalaAcesso.java
	 */
	public static final String COMPONENTE_SALA_ACESSO_MANY_CHECK_BOX = 
			"/xhtml/componente/salaAcesso/selectManyCheckBox/COMPONENTE_SALA_ACESSO_MANY_CHECK_BOX.xhtml";
	public static final String COMPONENTE_SALA_ACESSO_DATA_TABLE = 
			"/xhtml/componente/salaAcesso/dataTable/COMPONENTE_SALA_ACESSO_DATA_TABLE.xhtml";
	/**
	 * Componentes do SadcStatusAcesso.java
	 */

	public static final String COMPONENTE_STATUS_ACESSO_BOOLEAN_CHECK_BOX = 
			"/xhtml/componente/statusAcesso/booleanCheckBox/COMPONENTE_STATUS_ACESSO_BOOLEAN_CHECK_BOX.xhtml";
	public static final String COMPONENTE_STATUS_ACESSO_DESCRICAO_MANY_CHECK_BOX = 
			"/xhtml/componente/statusAcesso/selectManyCheckBox/COMPONENTE_STATUS_ACESSO_DESCRICAO_MANY_CHECK_BOX.xhtml";
	public static final String COMPONENTE_STATUS_ACESSO_DESCRICAO_MANY_MENU = 
			"/xhtml/componente/statusAcesso/selectManyMenu/COMPONENTE_STATUS_ACESSO_DESCRICAO_MANY_MENU.xhtml";
	public static final String COMPONENTE_STATUS_ACESSO_DATA_TABLE = 
			"/xhtml/componente/statusAcesso/dataTable/COMPONENTE_STATUS_ACESSO_DATA_TABLE.xhtml";
	public static final String COMPONENTE_STATUS_ACESSO_SELECT_ONE_MENU = 
			"/xhtml/componente/statusAcesso/selectOneMenu/COMPONENTE_STATUS_ACESSO_SELECT_ONE_MENU.xhtml";

	/**
	 * Componentes do SadcStatusAtualizacaoAcesso.java
	 */
	public static final String COMPONENTE_STATUS_ATUALIZACAO_ACESSO_SELECT_ONE_MENU = 
			"/xhtml/componente/statusAtualizacaoAcesso/selectOneMenu/COMPONENTE_STATUS_ATUALIZACAO_ACESSO_SELECT_ONE_MENU.xhtml";

	/**
	 * Componentes do SadcTransitoMaterial.java
	 */
	public static final String COMPONENTE_TRANSITO_MATERIAL_DATA_TABLE = 
			"/xhtml/componente/transitoMaterial/dataTable/COMPONENTE_TRANSITO_MATERIAL_DATA_TABLE.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_INSERIR_DIALOG = 
			"/xhtml/componente/transitoMaterial/dialog/COMPONENTE_TRANSITO_MATERIAL_INSERIR_DIALOG.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_FABRICANTE_INPUT_FIELD = 
			"/xhtml/componente/transitoMaterial/inputField/COMPONENTE_TRANSITO_MATERIAL_FABRICANTE_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_MODELO_INPUT_FIELD = 
			"/xhtml/componente/transitoMaterial/inputField/COMPONENTE_TRANSITO_MATERIAL_MODELO_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_HOST_NOME_INPUT_FIELD = 
			"/xhtml/componente/transitoMaterial/inputField/COMPONENTE_TRANSITO_MATERIAL_HOST_NOME_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_NUMERO_BEM_INPUT_FIELD = 
			"/xhtml/componente/transitoMaterial/inputField/COMPONENTE_TRANSITO_MATERIAL_NUMERO_BEM_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_NUMERO_SERIE_INPUT_FIELD = 
			"/xhtml/componente/transitoMaterial/inputField/COMPONENTE_TRANSITO_MATERIAL_NUMERO_SERIE_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_INSERIR_COMMAND_BUTTON = 
			"/xhtml/componente/transitoMaterial/commandButton/COMPONENTE_TRANSITO_MATERIAL_INSERIR_COMMAND_BUTTON.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_COMPLEXO_SALA_SELECT_ONE_MENU = 
			"/xhtml/componente/transitoMaterial/selectOneMenu/COMPONENTE_TRANSITO_MATERIAL_COMPLEXO_SALA_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_HOSTNAME_AUTO_COMPLETE = 
			"/xhtml/componente/transitoMaterial/autoComplete/COMPONENTE_TRANSITO_MATERIAL_HOSTNAME_AUTO_COMPLETE.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_HOSTNAME_PAI_AUTO_COMPLETE = 
			"/xhtml/componente/transitoMaterial/autoComplete/COMPONENTE_TRANSITO_MATERIAL_HOSTNAME_PAI_AUTO_COMPLETE.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_FABRICANTE_OUTPUT_TEXT = 
			"/xhtml/componente/transitoMaterial/outputText/COMPONENTE_TRANSITO_MATERIAL_FABRICANTE_OUTPUT_TEXT.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_MODELO_OUTPUT_TEXT = 
			"/xhtml/componente/transitoMaterial/outputText/COMPONENTE_TRANSITO_MATERIAL_MODELO_OUTPUT_TEXT.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_NUMERO_BEM_OUTPUT_TEXT = 
			"/xhtml/componente/transitoMaterial/outputText/COMPONENTE_TRANSITO_MATERIAL_NUMERO_BEM_OUTPUT_TEXT.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_NUMERO_SERIE_OUTPUT_TEXT = 
			"/xhtml/componente/transitoMaterial/outputText/COMPONENTE_TRANSITO_MATERIAL_NUMERO_SERIE_OUTPUT_TEXT.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_FABRICANTE_PAI_OUTPUT_TEXT = 
			"/xhtml/componente/transitoMaterial/outputText/COMPONENTE_TRANSITO_MATERIAL_FABRICANTE_PAI_OUTPUT_TEXT.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_MODELO_PAI_OUTPUT_TEXT = 
			"/xhtml/componente/transitoMaterial/outputText/COMPONENTE_TRANSITO_MATERIAL_MODELO_PAI_OUTPUT_TEXT.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_NUMERO_BEM_PAI_OUTPUT_TEXT = 
			"/xhtml/componente/transitoMaterial/outputText/COMPONENTE_TRANSITO_MATERIAL_NUMERO_BEM_PAI_OUTPUT_TEXT.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_NUMERO_SERIE_PAI_OUTPUT_TEXT = 
			"/xhtml/componente/transitoMaterial/outputText/COMPONENTE_TRANSITO_MATERIAL_NUMERO_SERIE_PAI_OUTPUT_TEXT.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_DATA_TABLE_RESULTADO = 
			"/xhtml/componente/transitoMaterial/dataTable/COMPONENTE_TRANSITO_MATERIAL_DATA_TABLE_RESULTADO.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_DATA_TABLE_SIMPLIFICADO = 
			"/xhtml/componente/transitoMaterial/dataTable/COMPONENTE_TRANSITO_MATERIAL_DATA_TABLE_SIMPLIFICADO.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_SIMPLIFICADO_INSERIR_DIALOG = 
			"/xhtml/componente/transitoMaterial/dialog/COMPONENTE_TRANSITO_MATERIAL_SIMPLIFICADO_INSERIR_DIALOG.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_CATEGORIA_SELECT_ONE_MENU = 
			"/xhtml/componente/transitoMaterial/selectOneMenu/COMPONENTE_TRANSITO_MATERIAL_CATEGORIA_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_DATA_TABLE_SIMPLIFICADO_RESULTADO = 
			"/xhtml/componente/transitoMaterial/dataTable/COMPONENTE_TRANSITO_MATERIAL_DATA_TABLE_SIMPLIFICADO_RESULTADO.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_MODELO_INPUT_TEXT_AREA = 
			"/xhtml/componente/transitoMaterial/inputTextArea/COMPONENTE_TRANSITO_MATERIAL_MODELO_INPUT_TEXT_AREA.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_SAIDA_PREDIO_INPUT_SWITCH = 
			"/xhtml/componente/transitoMaterial/inputSwith/COMPONENTE_TRANSITO_MATERIAL_SAIDA_PREDIO_INPUT_SWITCH.xhtml";
	public static final String COMPONENTE_TRANSITO_MATERIAL_DESTINO_MATERIAL_INPUT_TEXT_AREA = 
			"/xhtml/componente/transitoMaterial/inputTextArea/COMPONENTE_TRANSITO_MATERIAL_DESTINO_MATERIAL_INPUT_TEXT_AREA.xhtml";	
	public static final String COMPONENTE_TRANSITO_MATERIAL_CAPTURA_MAT_BOOLEAN_CHECK_BOX =
			"/xhtml/componente/transitoMaterial/booleanCheckBox/COMPONENTE_TRANSITO_MATERIAL_CAPTURA_MAT_BOOLEAN_CHECK_BOX.xhtml";	
	public static final String COMPONENTE_TRANSITO_MATERIAL_ENTRADA_MAT_BOOLEAN_CHECK_BOX =
			"/xhtml/componente/transitoMaterial/booleanCheckBox/COMPONENTE_TRANSITO_MATERIAL_ENTRADA_MAT_BOOLEAN_CHECK_BOX.xhtml";	
	public static final String COMPONENTE_TRANSITO_MATERIAL_SAIDA_MAT_BOOLEAN_CHECK_BOX =
			"/xhtml/componente/transitoMaterial/booleanCheckBox/COMPONENTE_TRANSITO_MATERIAL_SAIDA_MAT_BOOLEAN_CHECK_BOX.xhtml";	
	public static final String COMPONENTE_TRANSITO_MATERIAL_SAIDA_PREDIO_MAT_BOOLEAN_CHECK_BOX = 
			"/xhtml/componente/transitoMaterial/booleanCheckBox/COMPONENTE_TRANSITO_MATERIAL_SAIDA_PREDIO_MAT_BOOLEAN_CHECK_BOX.xhtml";

	public static final String ID_COMPONENTE_TRANSITO_MATERIAL_SAIDA_PREDIO_MAT_BOOLEAN_CHECK_BOX =
			"ID_COMPONENTE_TRANSITO_MATERIAL_SAIDA_PREDIO_MAT_BOOLEAN_CHECK_BOX";
	public static final String ID_DIV_TRANSITO_MATERIAL_SAIDA_PREDIO_MAT_BOOLEAN_CHECK_BOX = 
			"ID_DIV_TRANSITO_MATERIAL_SAIDA_PREDIO_MAT_BOOLEAN_CHECK_BOX";
	
	/**
	 * Componentes do SadcCategoria.java
	 */
	public static final String COMPONENTE_CATEGORIA_SELECT_ONE_RADIO = 
			"/xhtml/componente/categoria/selectOneRadio/COMPONENTE_CATEGORIA_SELECT_ONE_RADIO.xhtml";
	public static final String COMPONENTE_CATEGORIA_SELECT_ONE_MENU = 
			"/xhtml/componente/categoria/selectOneMenu/COMPONENTE_CATEGORIA_SELECT_ONE_MENU.xhtml";
	public static final String COMPONENTE_CATEGORIA_DESCRICAO_INPUT_FIELD = 
			"/xhtml/componente/categoria/inputField/COMPONENTE_CATEGORIA_DESCRICAO_INPUT_FIELD.xhtml";
	public static final String COMPONENTE_CATEGORIA_EDITAR_DATA_TABLE = 
			"/xhtml/componente/categoria/dataTable/COMPONENTE_CATEGORIA_EDITAR_DATA_TABLE.xhtml";
	/**
	 * Componentes do SadcServicoCategoriaProprietario.java
	 */
	public static final String COMPONENTE_SERVICO_CATEGORIA_PROPRIETARIO_CATEGORIA_SELECT_ONE_MENU = 
			"/xhtml/componente/servicoCategoriaProprietario/selectOneMenu/COMPONENTE_SERVICO_CATEGORIA_PROPRIETARIO_CATEGORIA_SELECT_ONE_MENU.xhtml";

	/**
	 * Componentes do SadcServico.java
	 */
	public static final String COMPONENTE_SERVICO_SELECT_ONE_RADIO = 
			"/xhtml/componente/servico/selectOneRadio/COMPONENTE_SERVICO_SELECT_ONE_RADIO.xhtml";
	public static final String COMPONENTE_SERVICO_SELECT_MANY_CHECK_BOX = 
			"/xhtml/componente/servico/selectManyCheckBox/COMPONENTE_SERVICO_SELECT_MANY_CHECK_BOX.xhtml";
	public static final String COMPONENTE_SERVICO_SELECT_ONE_MENU = 
			"/xhtml/componente/servico/selectOneMenu/COMPONENTE_SERVICO_SELECT_ONE_MENU.xhtml";
	/**
	 * Componentes do SadcArquivoAcesso.java
	 */
	public static final String COMPONENTE_ARQUIVO_ACESSO_ADICIONAR_FILE_UPLOAD = 
			"/xhtml/componente/arquivoAcesso/fileUpload/COMPONENTE_ARQUIVO_ACESSO_ADICIONAR_FILE_UPLOAD.xhtml";
	
	public static final String COMPONENTE_ARQUIVO_ACESSO_ADMIN_RELATORIO_BOOLEAN_CHECK_BOX =
			"/xhtml/componente/arquivoAcesso/booleanCheckBox/COMPONENTE_ARQUIVO_ACESSO_ADMIN_RELATORIO_BOOLEAN_CHECK_BOX.xhtml";
	
	public static final String COMPONENTE_ARQUIVO_ACESSO_ADMIN_IMAGEM_BOOLEAN_CHECK_BOX = 
			"/xhtml/componente/arquivoAcesso/booleanCheckBox/COMPONENTE_ARQUIVO_ACESSO_ADMIN_IMAGEM_BOOLEAN_CHECK_BOX.xhtml";
	
	public static final String COMPONENTE_ARQUIVO_ACESSO_ADMIN_IMAGEM_INPUT_FIELD =
			"/xhtml/componente/arquivoAcesso/inputField/COMPONENTE_ARQUIVO_ACESSO_ADMIN_IMAGEM_INPUT_FIELD.xhtml";
	
	public static final String COMPONENTE_ARQUIVO_ACESSO_ADMIN_RELATORIO_INPUT_FIELD =
			"/xhtml/componente/arquivoAcesso/inputField/COMPONENTE_ARQUIVO_ACESSO_ADMIN_RELATORIO_INPUT_FIELD.xhtml";
	
	public static final String COMPONENTE_ARQUIVO_ACESSO_ADMIN_IMAGEM_FILE_UPLOAD =
			"/xhtml/componente/arquivoAcesso/fileUpload/COMPONENTE_ARQUIVO_ACESSO_ADMIN_IMAGEM_FILE_UPLOAD.xhtml";
	
	public static final String COMPONENTE_ARQUIVO_ACESSO_ADMIN_RELATORIO_FILE_UPLOAD =
			"/xhtml/componente/arquivoAcesso/fileUpload/COMPONENTE_ARQUIVO_ACESSO_ADMIN_RELATORIO_FILE_UPLOAD.xhtml";
	
	public static final String COMPONENTE_ARQUIVO_ACESSO_INCLUIR_COMMAND_BUTTON = 
			"/xhtml/componente/arquivoAcesso/commandButton/COMPONENTE_ARQUIVO_ACESSO_INCLUIR_COMMAND_BUTTON.xhtml";
	public static final String COMPONENTE_ARQUIVO_ACESSO_SALVAR_DIALOG = 
			"/xhtml/componente/arquivoAcesso/dialog/COMPONENTE_ARQUIVO_ACESSO_SALVAR_DIALOG.xhtml";

	public static final String ID_COMPONENTE_ARQUIVO_ACESSO_ADMIN_IMAGEM_FILE_UPLOAD =
			"ID_COMPONENTE_ARQUIVO_ACESSO_ADMIN_IMAGEM_FILE_UPLOAD";
	
	public static final String ID_COMPONENTE_ARQUIVO_ACESSO_ADMIN_IMAGEM_BOOLEAN_CHECK_BOX = 
			"ID_COMPONENTE_ARQUIVO_ACESSO_ADMIN_IMAGEM_BOOLEAN_CHECK_BOX";
	
	public static final String ID_COMPONENTE_ARQUIVO_ACESSO_ADMIN_RELATORIO_BOOLEAN_CHECK_BOX = 
			"ID_COMPONENTE_ARQUIVO_ACESSO_ADMIN_RELATORIO_BOOLEAN_CHECK_BOX";
	
	public static final String ID_DIV_COMPONENTE_ARQUIVO_ACESSO_ADMIN_IMAGEM_INPUT_FIELD = 
			"ID_DIV_COMPONENTE_ARQUIVO_ACESSO_ADMIN_IMAGEM_INPUT_FIELD";
	
	public static final String ID_DIV_COMPONENTE_ARQUIVO_ACESSO_ADMIN_RELATORIO_INPUT_FIELD =
			"ID_DIV_COMPONENTE_ARQUIVO_ACESSO_ADMIN_RELATORIO_INPUT_FIELD";
	
	/**
	 * Componentes do SadcProprietario.java
	 */
	public static final String COMPONENTE_PROPRIETARIO_SELECT_ONE_RADIO = 
			"/xhtml/componente/proprietario/selectOneRadio/COMPONENTE_PROPRIETARIO_SELECT_ONE_RADIO.xhtml";

	/**
	 * Componentes do SadcReferenciaOrganizacional.java
	 */
	public static final String COMPONENTE_REFERENCIA_ORGANIZACIONAL_BOOLEAN_CHECK_BOX = 
			"/xhtml/componente/referenciaOrganizacional/booleanCheckBox/COMPONENTE_REFERENCIA_ORGANIZACIONAL_BOOLEAN_CHECK_BOX.xhtml";
	public static final String COMPONENTE_REFERENCIA_ORGANIZACIONAL_SELECT_MANY_CHECK_BOX = 
			"/xhtml/componente/referenciaOrganizacional/selectManyCheckBox/COMPONENTE_REFERENCIA_ORGANIZACIONAL_SELECT_MANY_CHECK_BOX.xhtml";

	/**
	 * Componentes do SadcReferenciaSistema.java
	 */
	public static final String COMPONENTE_REFERENCIA_SISTEMA_DATA_TABLE = 
			"/xhtml/componente/referenciaSistema/dataTable/COMPONENTE_REFERENCIA_SISTEMA_DATA_TABLE.xhtml";

	/**
	 * Componentes do CardHolderP2000.java
	 */

	public static final String COMPONENTE_USUARIO_CADASTRADO_P2000_DATA_TABLE = 
			"/xhtml/componente/p2000usuario/dataTable/COMPONENTE_USUARIO_CADASTRADO_P2000_DATA_TABLE.xhtml";

	/**
	 * DataTables do Sistema SADC
	 */
	public static final String COMPONENTE_ARQUIVO_ACESSO_DATA_TABLE = 
			"/xhtml/componente/arquivoAcesso/dataTable/COMPONENTE_ARQUIVO_ACESSO_DATA_TABLE.xhtml";
	public static final String COMPONENTE_ARQUIVO_ACESSO_RESULTADO_DATA_TABLE = 
			"/xhtml/componente/arquivoAcesso/dataTable/COMPONENTE_ARQUIVO_ACESSO_RESULTADO_DATA_TABLE.xhtml";
	/**
	 * Dialogs do Sistema SADC
	 */

	public static final String COMPONENTE_DIALOG_TEMPLATE = 
			"/xhtml/componente/template/COMPONENTE_DIALOG_TEMPLATE.xhtml";
	
	public static final String COMPONENTE_ACESSO_ERROS_DIALOG =
			"/xhtml/componente/template/COMPONENTE_ACESSO_ERROS_DIALOG.xhtml";
	
	public static final String COMPONENTE_DIALOG_EXCEPTION_TEMPLATE = 
			"/xhtml/componente/template/COMPONENTE_DIALOG_EXCEPTION_TEMPLATE.xhtml";
	public static final String COMPONENTE_CONFIRM_DIALOG_TEMPLATE = 
			"/xhtml/componente/template/COMPONENTE_CONFIRM_DIALOG_TEMPLATE.xhtml";
	public static final String COMPONENTE_DADOS_USUARIO_LOGADO_TEMPLATE = 
			"/xhtml/componente/template/COMPONENTE_DADOS_USUARIO_LOGADO_TEMPLATE.xhtml";

	public static final long ID_COMPLEXO_CCT1 = 1;
	public static final String LABEL_ACESSO = "Acesso";
	public static final String LABEL_SELECIONE = "Selecione";
	public static final String LABEL_TIPO_ACESSO = "Tipo Acesso";
	public static final String LABEL_CHAVE = "Chave";
	public static final String LABEL_UOR = "UOR";
	public static final String LABEL_EQUIPE = "Equipe";
	public static final String LABEL_EQUIPE_SOLUCIONADORA = "Equipe Solucionadora";
	public static final String LABEL_NOME = "Nome";
	public static final String LABEL_JUSTIFICATIVA = "Justificativa";
	public static final String LABEL_ANOTACAO = "Anotação";
	public static final String LABEL_COMPLEXO = "Complexo";
	public static final String LABEL_SALA = "Sala";
	public static final String LABEL_SALAS = "Salas";
	public static final String LABEL_DATA_INICIO = "Data Início";
	public static final String LABEL_DATA_FIM = "Data Fim";
	public static final String LABEL_ME_INCLUIR = "Me Incluir";
	public static final String LABEL_INCLUIR_VISITANTE = "Incluir Visitante";
	public static final String LABEL_INCLUIR = "Incluir";
	public static final String LABEL_INSERIR = "Inserir";
	public static final String LABEL_VISITANTES_TECNOTOUR = "Incluir Visitantes";
	public static final String LABEL_PERFIL_DADOS_BASICOS = "Perfil Básico";
	public static final String LABEL_PERFIL_DADOS_COM_CONDICOES = "Perfil com Condiçães";
	public static final String LABEL_MODULO = "Módulo(s)";
	public static final String LABEL_NOVO_MODULO = "Novo Link Menu";
	public static final String LABEL_GRUPO = "Grupo(s)";
	public static final String LABEL_OBJETO_FORMULARIO = "Objeto(s) Formulário(s)";
	public static final String LABEL_STATUS_ACESSO = "Status Acesso(s)";
	public static final String LABEL_STATUS_ATUALIZACAO_ACESSO = "Status Atualização Acesso(s)";
	public static final String LABEL_REFERENCIA_ORGANIZACIONAL = "Referência Organizacional";
	public static final String LABEL_FORMULARIO = "Formulário(s)";
	public static final String LABEL_SALVAR = "Salvar";
	public static final String LABEL_NOVO = "Novo";
	public static final String LABEL_DIRETORIO = "Diretório";
	public static final String LABEL_ARQUIVO_XHTML = "Arquivo Ex:(nomeDoArquivo)";
	public static final String LABEL_TITULO = "Título";
	public static final String LABEL_CANCELAR = "Cancelar";
	public static final String LABEL_ALTERAR = "Alterar";
	public static final String LABEL_EDITAR = "Editar";
	public static final String LABEL_DOCUMENTO = "Documento";
	public static final String LABEL_CHAVE_SISBB = "Chave Sisbb";
	public static final String LABEL_TELEFONE = "Telefone";
	public static final String LABEL_DESCRICAO = "Descrição";
	public static final String LABEL_EQUIPE_EXECUTORA = "Equipe Executora";
	public static final String LABEL_EQUIPE_SOLICITANTE = "Equipe Solicitante";
	public static final String LABEL_RESPONSAVEL_DEMANDA = "Responsável pela Demanda";
	public static final String LABEL_USUARIO_LOGADO = "Usuário Logado";
	public static final String LABEL_USUARIO_ADMIN = "Usuário Admin";
	public static final String LABEL_LIBERACAO = "Liberação";
	public static final String LABEL_INICIO_PLANEJADO = "Início Planejado";
	public static final String LABEL_TERMINO_PLANEJADO = "Término Planejado";
	public static final String LABEL_INICIO_SERVICO = "Início Serviço";
	public static final String LABEL_TERMINO_SERVICO = "Término Serviço";
	public static final String LABEL_INICIO_EVENTO = "Início Evento";
	public static final String LABEL_TERMINO_EVENTO = "Término Evento";
	public static final String LABEL_TIPO_DOCUMENTO = "Tipo Documento";
	public static final String LABEL_AREA_COMPLEXO = "Área Complexo";
	public static final String LABEL_INCIDENTE = "Incidente";
	public static final String LABEL_ATUALIZACOES = "Atualizaçães";
	public static final String LABEL_RESPONSAVEL_CHAVE = "Chave Responsável";
	public static final String LABEL_LISTAR_OBJETO_FORMULARIO = "Editar Objeto(s) Formulário(s)";
	public static final String LABEL_BOTAO = "Botão";
	public static final String LABEL_INSERIR_ITEM = "Inserir Item";

	public static final String LABEL_ACAO_CANCELAR = "Cancelar";
	public static final String LABEL_FORMULARIO_LINK = "Formulário";
	public static final String LABEL_LINK = "Link URL";

	public static final String LABEL_TRANSITO_DE_ITENS = "Trânsito de Materiais e Equipamentos";
	public static final String LABEL_SERVICO = "Serviço";
	public static final String LABEL_TIPO_DE_ITEM = "Tipo de Item";
	public static final String LABEL_PROPRIETARIO = "Proprietário";
	public static final String LABEL_INCLUIR_ATUALIZACAO = "Incluir Atualização";
	public static final String LABEL_INCLUIR_ANEXO = "Incluir Anexo";
	public static final String LABEL_TIPO_ORDINARIO = "Tipo Ordinário";
	public static final String LABEL_BOTAO_ACAO = "Botão Ação";

	public static final String LABEL_PARAMETRO_SISTEMA = "Parâmetro Sistema";
	public static final String LABEL_REFERENCIA_SISTEMA = "Referência Sistema";

	public static final String LABEL_NUM_DOC = "Num. Documento";
	public static final String LABEL_DOC_VISITANTE = "Doc. Visitante";
	public static final String LABEL_EMPRESA = "Empresa";
	/**
	 * CommandButton do
	 */

	public static final String ID_COMPONENTE_ACE_EDITAR_COMMAND_BUTTON = "editar";

	public static final String ID_COMPONENTE_ARQUIVO_ACESSO_SALVAR_DIALOG = 
			"ID_COMPONENTE_ARQUIVO_ACESSO_SALVAR_DIALOG";
	public static final String ID_COMPONENTE_USUARIO_LOGADO_INCLUIR_COMMAND_BUTTON = 
			"ID_COMPONENTE_USUARIO_LOGADO_INCLUIR_COMMAND_BUTTON";
	public static final String ID_COMPONENTE_USUARIO_INCLUIR_COMMAND_BUTTON = 
			"ID_COMPONENTE_USUARIO_INCLUIR_COMMAND_BUTTON";
	public static final String ID_COMPONENTE_USUARIO_COMMAND_BUTTON_DIALOG = 
			"ID_COMPONENTE_USUARIO_COMMAND_BUTTON_DIALOG";
	public static final String ID_COMPONENTE_ATUALIZACAO_ACESSO_INCLUR_COMMAND_BUTTON = 
			"ID_COMPONENTE_ATUALIZACAO_ACESSO_INCLUR_COMMAND_BUTTON";
	public static final String ID_COMPONENTE_GRUPO_ACESSO_MENU_SALVAR_COMMAND_BUTTON = 
			"ID_COMPONENTE_GRUPO_ACESSO_MENU_SALVAR_COMMAND_BUTTON";
	public static final String ID_COMPONENTE_USUARIO_DATA_TABLE = 
			"ID_COMPONENTE_USUARIO_DATA_TABLE";
	public static final String ID_COMPONENTE_ARQUIVO_ACESSO_DATA_TABLE = 
			"ID_COMPONENTE_ARQUIVO_ACESSO_DATA_TABLE";
	public static final String ID_COMPONENTE_ATUALIZACAO_ACESSO_DATA_TABLE = 
			"ID_COMPONENTE_ATUALIZACAO_ACESSO_DATA_TABLE";
	public static final String ID_COMPONENTE_ATUALIZACAO_ACESSO_ANOTACAO_TEXT_AREA = 
			"ID_COMPONENTE_ATUALIZACAO_ACESSO_ANOTACAO_TEXT_AREA";
	public static final String ID_COMPONENTE_OBJETO_FORMULARIO_INDICADOR_VISUALIZAR_SELECT_ONE_RADIO = 
			"ID_COMPONENTE_OBJETO_FORMULARIO_INDICADOR_VISUALIZAR_SELECT_ONE_RADIO";
	public static final String ID_COMPONENTE_COMPLEXO_SELECT_ONE_MENU = 
			"ID_COMPONENTE_COMPLEXO_SELECT_ONE_MENU";
	public static final String ID_COMPONENTE_GRUPO_ACESSO_AUTO_COMPLETE = 
			"ID_COMPONENTE_GRUPO_ACESSO_AUTO_COMPLETE";
	public static final String ID_COMPONENTE_GRUPO_ACESSO_BOOLEAN_CHECK_BOX = 
			"ID_COMPONENTE_GRUPO_ACESSO_BOOLEAN_CHECK_BOX";
	public static final String ID_COMPONENTE_OBJETO_FORMULARIO_TEXTO_DESCRICAO_SELECT_ONE_MENU = 
			"ID_COMPONENTE_OBJETO_FORMULARIO_TEXTO_DESCRICAO_SELECT_ONE_MENU";
	public static final String ID_COMPONENTE_OBJETO_FORMULARIO_MENU_TEXTO_DESCRICAO_SELECT_ONE_MENU = 
			"ID_COMPONENTE_OBJETO_FORMULARIO_MENU_TEXTO_DESCRICAO_SELECT_ONE_MENU";
	public static final String ID_COMPONENTE_FORMULARIO_NOME_DESCRICAO_SELECT_ONE_MENU = 
			"ID_COMPONENTE_FORMULARIO_NOME_DESCRICAO_SELECT_ONE_MENU";
	public static final String ID_COMPONENTE_FORMULARIO_DIRETORIO_SELECT_ONE_MENU = 
			"ID_COMPONENTE_FORMULARIO_DIRETORIO_SELECT_ONE_MENU";
	public static final String ID_COMPONENTE_STATUS_ACESSO_BOOLEAN_CHECK_BOX = 
			"ID_COMPONENTE_STATUS_ACESSO_BOOLEAN_CHECK_BOX";
	public static final String ID_COMPONENTE_GRUPO_ACESSO_SIGLA_SELECT_MANY_CHECK_BOX = 
			"ID_COMPONENTE_GRUPO_ACESSO_SIGLA_SELECT_MANY_CHECK_BOX";
	public static final String ID_COMPONENTE_REFERENCIA_ORGANIZACIONAL_SELECT_MANY_CHECK_BOX = 
			"ID_COMPONENTE_REFERENCIA_ORGANIZACIONAL_SELECT_MANY_CHECK_BOX";
	public static final String ID_COMPONENTE_STATUS_ACESSO_MANY_CHECK_BOX = 
			"ID_COMPONENTE_STATUS_ACESSO_MANY_CHECK_BOX";
	public static final String ID_COMPONENTE_TIPO_ACESSO_MANY_CHECK_BOX = 
			"ID_COMPONENTE_TIPO_ACESSO_MANY_CHECK_BOX";
	public static final String ID_COMPONENTE_STATUS_ACESSO_DESCRICAO_PANEL_GRID = 
			"ID_COMPONENTE_STATUS_ACESSO_DESCRICAO_PANEL_GRID";
	public static final String ID_COMPONENTE_GRUPO_ACESSO_SIGLA_PANEL_GRID = 
			"ID_COMPONENTE_GRUPO_ACESSO_SIGLA_PANEL_GRID";
	public static final String ID_COMPONENTE_REFERENCIA_ORGANIZACIONAL_PANEL_GRID = 
			"ID_COMPONENTE_REFERENCIA_ORGANIZACIONAL_PANEL_GRID";
	public static final String ID_COMPONENTE_OBJETO_FORMULARIO_ADMIN_OPCOES_PANEL_GRID = 
			"ID_COMPONENTE_OBJETO_FORMULARIO_ADMIN_OPCOES_PANEL_GRID";
	public static final String ID_COMPONENTE_GRUPO_ACESSO_MENU_NOME_ADMIN_PANEL_GRID = 
			"ID_COMPONENTE_GRUPO_ACESSO_MENU_NOME_ADMIN_PANEL_GRID";
	public static final String ID_COMPONENTE_REFERENCIA_ORGANIZACIONAL_MANY_CHECK_BOX = 
			"ID_COMPONENTE_REFERENCIA_ORGANIZACIONAL_MANY_CHECK_BOX";
	public static final String ID_COMPONENTE_OBJETO_FORMULARIO_ADMIN_PANEL_GRID = 
			"ID_COMPONENTE_OBJETO_FORMULARIO_ADMIN_PANEL_GRID";
	public static final String ID_COMPONENTE_FORMULARIO_MENU_CONFIRMACAO_DIALOG = 
			"ID_COMPONENTE_FORMULARIO_MENU_CONFIRMACAO_DIALOG";
	public static final String ID_COMPONENTE_FORMULARIO_MENU_CONFIRMACAO_DIALOG_COMMAND_BUTTON = 
			"ID_COMPONENTE_FORMULARIO_MENU_CONFIRMACAO_DIALOG_COMMAND_BUTTON";
	public static final String ID_PAINEL_DADOS_SOLICITANTE = "ID_PAINEL_DADOS_SOLICITANTE";
	public static final String ID_PAINEL_LOCAL = "ID_PAINEL_LOCAL";
	
	public static final String ID_PAINEL_DETALHE_ACE = "ID_PAINEL_DETALHE_ACE";
	public static final String ID_PANEL_GSTI_ACE = "ID_PANEL_GSTI_ACE";
	
	
	
	public static final String ID_COMPONENTE_OBJETO_FORMULARIO_DATA_TABLE = "ID_COMPONENTE_OBJETO_FORMULARIO_DATA_TABLE";
	public static final String ID_COMPONENTE_PARAMETRO_SISTEMA_DATA_TABLE = "ID_COMPONENTE_PARAMETRO_SISTEMA_DATA_TABLE";
	public static final String ID_COMPONENTE_STATUS_ACESSO_DATA_TABLE = "ID_COMPONENTE_STATUS_ACESSO_DATA_TABLE";
	public static final String ID_COMPONENTE_REFERENCIA_SISTEMA_DATA_TABLE = "ID_COMPONENTE_REFERENCIA_SISTEMA_DATA_TABLE";
	public static final String ID_COMPONENTE_AREA_COMPLEXO_SELECT_ONE_MENU = "ID_COMPONENTE_AREA_COMPLEXO_SELECT_ONE_MENU";
	public static final String ID_COMPONENTE_SALA_EDITAR_DATA_TABLE = "ID_COMPONENTE_SALA_EDITAR_DATA_TABLE";
	public static final String ID_COMPONENTE_COMPLEXO_EDITAR_DATA_TABLE = "ID_COMPONENTE_COMPLEXO_EDITAR_DATA_TABLE";
	public static final String ID_COMPONENTE_OBJETO_FORMULARIO_METODOS_ACTION_SADC_CONTROLADOR_SELECT_ONE_MENU = 
			"ID_COMPONENTE_OBJETO_FORMULARIO_METODOS_ACTION_SADC_CONTROLADOR_SELECT_ONE_MENU";
	public static final String ID_FILE_UPLOAD_ARQUIVO_ACESSO = "ID_FILE_UPLOAD_ARQUIVO_ACESSO";
	public static final String ID_COMPONENTE_USUARIO_ACESSO_TIPO_USUARIO_ENUM_SELECT_ONE_RADIO = 
			"ID_COMPONENTE_USUARIO_ACESSO_TIPO_USUARIO_ENUM_SELECT_ONE_RADIO";
	public static final String ID_COMPONENTE_USUARIO_ACESSO_EMPRESA_INPUT_FIELD = 
			"ID_COMPONENTE_USUARIO_ACESSO_EMPRESA_INPUT_FIELD";
	public static final String ID_COMPONENTE_USUARIO_ACESSO_NUMERO_DOCUMENTO_INPUT_FIELD = 
			"ID_COMPONENTE_USUARIO_ACESSO_NUMERO_DOCUMENTO_INPUT_FIELD";
	public static final String ID_DIV_COMPONENTE_USUARIO_ACESSO_NUMERO_DOCUMENTO_INPUT_FIELD =
			"ID_DIV_COMPONENTE_USUARIO_ACESSO_NUMERO_DOCUMENTO_INPUT_FIELD";
	public static final String ID_COMPONENTE_USUARIO_ACESSO_NOME_INPUT_FIELD = "ID_COMPONENTE_USUARIO_ACESSO_NOME_INPUT_FIELD";
	public static final String ID_COMPONENTE_USUARIO_ACESSO_TIPO_USUARIO_ENUM_SELECT_ONE_MENU = 
			"ID_COMPONENTE_USUARIO_ACESSO_TIPO_USUARIO_ENUM_SELECT_ONE_MENU";
	public static final String ID_DIV_COMPONENTE_TIPO_DOCUMENTO_ENUM = "ID_DIV_COMPONENTE_TIPO_DOCUMENTO_ENUM";
	
	public static final String ID_DIV_COMPONENTE_TRANSITO_MATERIAL_SAIDA_PREDIO_INPUT_SWITCH =
			"ID_DIV_COMPONENTE_TRANSITO_MATERIAL_SAIDA_PREDIO_INPUT_SWITCH";
	
	public static final String ID_DIV_COMPONENTE_USUARIO_ACESSO_EMPRESA_INPUT_FIELD = 
			"ID_DIV_COMPONENTE_USUARIO_ACESSO_EMPRESA_INPUT_FIELD";
	public static final String ID_COMPONENTE_TRANSITO_MATERIAL_DATA_TABLE = "ID_COMPONENTE_TRANSITO_MATERIAL_DATA_TABLE";
	public static final String ID_COMPONENTE_CATEGORIA_SELECT_ONE_RADIO = "ID_COMPONENTE_CATEGORIA_SELECT_ONE_RADIO";
	public static final String ID_COMPONENTE_SERVICO_SELECT_ONE_RADIO = "ID_COMPONENTE_SERVICO_SELECT_ONE_RADIO";
	public static final String ID_COMPONENTE_TRANSITO_MATERIAL_COMPLEXO_SALA_SELECT_ONE_MENU = 
			"ID_COMPONENTE_TRANSITO_MATERIAL_COMPLEXO_SALA_SELECT_ONE_MENU";
	public static final String ID_COMPONENTE_TRANSITO_MATERIAL_INSERIR_DIALOG = 
			"ID_COMPONENTE_TRANSITO_MATERIAL_INSERIR_DIALOG";
	public static final String ACAO_COMPONENTE_TRANSITO_MATERIAL_ALTERAR_DIALOG = 
			"ACAO_COMPONENTE_TRANSITO_MATERIAL_ALTERAR_DIALOG";
	public static final String ID_COMPONENTE_TRANSITO_MATERIAL_HOSTNAME_AUTO_COMPLETE = 
			"ID_COMPONENTE_TRANSITO_MATERIAL_HOSTNAME_AUTO_COMPLETE";
	public static final String ID_COMPONENTE_SERVICO_SELECT_MANY_CHECKBOX = "ID_COMPONENTE_SERVICO_SELECT_MANY_CHECKBOX";
	public static final String ID_COMPONENTE_PROPRIETARIO_SELECT_ONE_RADIO = "ID_COMPONENTE_PROPRIETARIO_SELECT_ONE_RADIO";
	public static final String ID_COMPONENTE_ATUALIZACAO_ACESSO_SALVAR_DIALOG = 
			"ID_COMPONENTE_ATUALIZACAO_ACESSO_SALVAR_DIALOG";
	public static final String ID_COMPONENTE_ATUALIZACAO_ACESSO_INCLUIR_COMMAND_BUTTON = 
			"ID_COMPONENTE_ATUALIZACAO_ACESSO_INCLUIR_COMMAND_BUTTON";
	public static final String ID_COMPONENTE_ARQUIVO_ACESSO_INCLUIR_COMMAND_BUTTON = 
			"ID_COMPONENTE_ARQUIVO_ACESSO_INCLUIR_COMMAND_BUTTON";
	public static final String ID_COMPONENTE_ACESSO_ORDINARIO_DESCRICAO_SELECT_ONE_MENU = 
			"ID_COMPONENTE_ACESSO_ORDINARIO_DESCRICAO_SELECT_ONE_MENU";
	
	public static final String ID_COMPONENTE_ACESSO_MONITORACAO_PESQUISAR_BUTTON = 
			"ID_COMPONENTE_ACESSO_MONITORACAO_PESQUISAR_BUTTON";
	
	public static final String ID_COMPONENTE_ACESSO_DATA_TABLE = "ID_COMPONENTE_ACESSO_DATA_TABLE";
	public static final String ID_COMPONENTE_ACESSO_DATA_TABLE_HEAD = "ID_COMPONENTE_ACESSO_DATA_TABLE_head";
	public static final String ID_COMPONENTE_MATERIAL_DATA_TABLE_HEAD = "ID_COMPONENTE_MATERIAL_DATA_TABLE_head";
	public static final String ID_COMPONENTE_MATERIAL_DATA_TABLE = "ID_COMPONENTE_MATERIAL_DATA_TABLE";
	public static final String ID_COMPONENTE_ACESSO_DATA_TABLE_MONITORACAO = "ID_COMPONENTE_ACESSO_DATA_TABLE_MONITORACAO";
	public static final String ID_COMPONENTE_USUARIO_DATA_TABLE_RESULTADO = "ID_COMPONENTE_USUARIO_DATA_TABLE_RESULTADO";
	public static final String ID_COMPONENTE_REFERENCIA_ORGANIZACIONAL_BOOLEAN_CHECK_BOX = 
			"ID_COMPONENTE_REFERENCIA_ORGANIZACIONAL_BOOLEAN_CHECK_BOX";
	public static final String ID_COMPONENTE_USUARIO_ACESSO_PAIS_AUTO_COMPLETE = 
			"ID_COMPONENTE_USUARIO_ACESSO_PAIS_AUTO_COMPLETE";
	public static final String ID_COMPONENTE_USUARIO_ACESSO_PAIS = "ID_COMPONENTE_USUARIO_ACESSO_PAIS";
	public static final String ID_COMPONENTE_LDAP_USUARIO_GRUPO_ACESSO_DATA_TABLE = 
			"ID_COMPONENTE_LDAP_USUARIO_GRUPO_ACESSO_DATA_TABLE";
	public static final String ID_COMPONENTE_MENU_DATA_TABLE = "ID_COMPONENTE_MENU_DATA_TABLE";
	public static final String ID_COMPONENTE_GRUPO_ACESSO_MENU_DATA_TABLE = "ID_COMPONENTE_GRUPO_ACESSO_MENU_DATA_TABLE";
	public static final String ID_COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DIALOG = 
			"ID_COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DIALOG";
	public static final String ID_COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DETALHE_DIALOG = 
			"ID_COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DETALHE_DIALOG";
	public static final String ID_COMPONENTE_INCIDENTE_SEGURANCA_ACESSO_AUTO_COMPLETE = 
			"ID_COMPONENTE_INCIDENTE_SEGURANCA_ACESSO_AUTO_COMPLETE";
	public static final String ID_COMPONENTE_FORMULARIO_DATA_TABLE = "ID_COMPONENTE_FORMULARIO_DATA_TABLE";
	public static final String ID_COMPONENTE_INCIDENTE_SEGURANCA_DATA_TABLE = "ID_COMPONENTE_INCIDENTE_SEGURANCA_DATA_TABLE";
	public static final String ID_PAGINA_SADC_TEMPLATE_CONTENT_HEADER = "ID_PAGINA_SADC_TEMPLATE_CONTENT_HEADER";
	public static final String ID_COMPONENTE_CATEGORIA_EDITAR_DATA_TABLE = "ID_COMPONENTE_CATEGORIA_EDITAR_DATA_TABLE";
	public static final String ID_MESSAGES = "ID_MESSAGES";

	/**
	 * Id componentes TipoAcesso
	 */

	public static final String ID_COMPONENTE_TIPO_ACESSO_ENUM = "ID_COMPONENTE_TIPO_ACESSO_ENUM";

	/**
	 * id componente SadcAtualizacaoAcesso
	 */

	public static final String ID_COMPONENTE_ACESSO_VISTORIA_ATUALIZACOES_TAB = "ID_COMPONENTE_ACESSO_VISTORIA_ATUALIZACOES_TAB";

	/**
	 * id componente SadcSala
	 */
	public static final String ID_COMPONENTE_SALA_MANY_CHECK_BOX = "ID_COMPONENTE_SALA_MANY_CHECK_BOX";

	/**
	 * id componente SadcAcesso
	 */

	public static final String ID_COMPONENTE_ACESSO_JUSTIFICATIVA_INPUT_TEXT_AREA = 
			"ID_COMPONENTE_ACESSO_JUSTIFICATIVA_INPUT_TEXT_AREA";
	public static final String ID_COMPONENTE_ACESSO_SOLICITANTE_PANEL_GRID = "ID_COMPONENTE_ACESSO_SOLICITANTE_PANEL_GRID";

	public static final String ID_COMPONENTE_ACESSO_ACCORDION_PANEL = "ID_COMPONENTE_ACESSO_ACCORDION_PANEL";

	public static final String ID_COMPONENTE_MENU_NOVO_DIALOG = "ID_COMPONENTE_MENU_NOVO_DIALOG";
	public static final String ID_COMPONENTE_MENU_NOVO_MODULO_DIALOG = "ID_COMPONENTE_MENU_NOVO_MODULO_DIALOG";
	public static final String ID_COMPONENTE_MENU_DESCRICAO_INPUT_FIELD = "ID_COMPONENTE_MENU_DESCRICAO_INPUT_FIELD";
	public static final String ID_COMPONENTE_MENU_DESCRICAO_SELECT_ONE_MENU = "ID_COMPONENTE_MENU_DESCRICAO_SELECT_ONE_MENU";
	public static final String ID_COMPONENTE_MENU_DESCRICAO_TREE = "ID_COMPONENTE_MENU_DESCRICAO_TREE";
	public static final String ID_COMPONENTE_MENU_DIALOG_SALVAR_COMMAND_BUTTON = "ID_COMPONENTE_MENU_DIALOG_SALVAR_COMMAND_BUTTON";
	public static final String ID_COMPONENTE_MENU_SALVAR_MODULO_COMMAND_BUTTON = "ID_COMPONENTE_MENU_SALVAR_MODULO_COMMAND_BUTTON";
	public static final String ID_COMPONENTE_MENU_NOVO_MODULO_PANEL_GRID_DIALOG = "ID_COMPONENTE_MENU_NOVO_MODULO_PANEL_GRID_DIALOG";
	public static final String ID_COMPONENTE_MENU_NOVO_PANEL_GRID_DIALOG = "ID_COMPONENTE_MENU_NOVO_PANEL_GRID_DIALOG";

	/**
	 * id componente SadcUsuario
	 */
	public static final String ID_COMPONENTE_USUARIO_INCLUIR_DIALOG = "ID_COMPONENTE_USUARIO_INCLUIR_DIALOG";
	public static final String ID_COMPONENTE_TIPO_DOCUMENTO_ENUM = "ID_COMPONENTE_TIPO_DOCUMENTO_ENUM";

	public static final String ID_FORM_ADMIN_OBJETO_FORMULARIO = "ID_FORM_ADMIN_OBJETO_FORMULARIO";
	public static final String ID_FORM_ADMIN_MENU = "ID_FORM_ADMIN_MENU";
	public static final String ID_FORM_ADMIN_FORMULARIO_MENU = "ID_FORM_ADMIN_FORMULARIO_MENU";
	public static final String ID_FORM_ADMIN_FORMULARIO = "ID_FORM_ADMIN_FORMULARIO";
	
	public static final String ID_FORM_ACESSO = "ID_FORM_ACESSO";

	
	public static final String ID_FORM_ACESSO_PESQUISAR = "ID_FORM_ACESSO_PESQUISAR";
	public static final String ID_FORM_ACESSO_MONITORACAO = "ID_FORM_ACESSO_MONITORACAO";
	public static final String ID_FORM_ACESSO_AGUARDANDO_AUTORIZACAO = "ID_FORM_ACESSO_AGUARDANDO_AUTORIZACAO";
	public static final String ID_FORM_MENU = "ID_FORM_MENU";
	public static final String ID_FORM_MENU_NOVO_DIALOG = "ID_FORM_MENU_NOVO_DIALOG";
	public static final String ID_FORM_MENU_NOVO_MODULO_DIALOG = "ID_FORM_MENU_NOVO_MODULO_DIALOG";
	public static final String ID_FORM_FORMULARIO_MENU_CONFIRMACAO_DIALOG = "ID_FORM_FORMULARIO_MENU_CONFIRMACAO_DIALOG";
	public static final String ID_FORM_COMPONENTE_USUARIO_INCLUIR_DIALOG = "ID_FORM_COMPONENTE_USUARIO_INCLUIR_DIALOG";
	public static final String ID_FORM_COMPONENTE_MATERIAL_INSERIR_DIALOG = "ID_FORM_COMPONENTE_MATERIAL_INSERIR_DIALOG";
	public static final String ID_FORM_COMPONENTE_ATUALIZACAO_ACESSO_SALVAR_DIALOG = 
			"ID_FORM_COMPONENTE_ATUALIZACAO_ACESSO_SALVAR_DIALOG";
	public static final String ID_FORM_ACESSO_RESULTADO = "ID_FORM_ACESSO_RESULTADO";
	public static final String ID_FORM_COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DIALOG = 
			"ID_FORM_COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DIALOG";
	public static final String ID_FORM_COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_PENDENCIA_DIALOG = 
			"ID_FORM_COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_PENDENCIA_DIALOG";
	public static final String ID_PAGINA_ACESSO_PESQUISAR = "ID_PAGINA_ACESSO_PESQUISAR";

	/**
	 * id componente Material
	 */
	public static final String ID_COMPONENTE_MATERIAL_INSERIR_COMMAND_BUTTON = 
			"ID_COMPONENTE_MATERIAL_INSERIR_COMMAND_BUTTON";
	public static final String ID_COMPONENTE_MATERIAL_INSERIR_COMMAND_BUTTON_ONCOMPLETE = 
			"ID_COMPONENTE_MATERIAL_INSERIR_COMMAND_BUTTON_ONCOMPLETE";

	public static final String ID_FIELD_SET_EQUIPAMENTO_PAI = "ID_FIELD_SET_EQUIPAMENTO_PAI";

	public static final String ID_PANEL_GRID_COMPONENTE_FORMULARIO_NOME_SELECT_ONE_MENU = 
			"ID_PANEL_GRID_COMPONENTE_FORMULARIO_NOME_SELECT_ONE_MENU";

	public static final String ID_MESSAGES_MENU_NOVO_DIALOG = "ID_MESSAGES_MENU_NOVO_DIALOG";
	public static final String ID_MESSAGES_MENU_NOVO_MODULO_DIALOG = "ID_MESSAGES_MENU_NOVO_MODULO_DIALOG";

	public static final String WIDGET_VAR_MENU_NOVO_DIALOG = "WIDGET_VAR_MENU_NOVO_DIALOG";
	public static final String WIDGET_VAR_MENU_NOVO_MODULO_DIALOG = "WIDGET_VAR_MENU_NOVO_MODULO_DIALOG";
	public static final String WIDGET_VAR_FORMULARIO_MENU_CONFIRMACAO_DIALOG = "WIDGET_VAR_FORMULARIO_MENU_CONFIRMACAO_DIALOG";
	public static final String WIDGET_VAR_DIALOG_ACESSO_INCIDENTE_REGISTRO_POSTERIOR = 
			"WIDGET_VAR_DIALOG_ACESSO_INCIDENTE_REGISTRO_POSTERIOR";
	public static final String WIDGET_VAR_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DETALHE_DIALOG = 
			"WIDGET_VAR_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_DETALHE_DIALOG";
	public static final String WIDGET_VAR_COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_PENDENCIA_DIALOG = 
			"WIDGET_VAR_COMPONENTE_ACESSO_INCIDENTE_REGISTRO_POSTERIOR_PENDENCIA_DIALOG";
	public static final String WIDGET_VAR_COMPONENTE_ACESSO_CREDENCIAR_DIALOG = 
			"WIDGET_VAR_COMPONENTE_ACESSO_CREDENCIAR_DIALOG";

	public static final String PARAMETRO_COMPONENTE_MENU_DIALOG_SALVAR_COMMAND_BUTTON = 
			"PARAMETRO_COMPONENTE_MENU_DIALOG_SALVAR_COMMAND_BUTTON";

	public static final String PARAMETRO_FILE_UPLOAD_ARQUIVO_NOME = "PARAMETRO_FILE_UPLOAD_ARQUIVO_NOME";

	public static final String PARAMETRO_FILE_UPLOAD_ARQUIVO_ACESSO = "PARAMETRO_FILE_UPLOAD_ARQUIVO_ACESSO";

	public static final String EXCEPTION_NULL_POINTER = "EXCEPTION_NULL_POINTER";
	public static final String EXCEPTION_VIEW_EXPIRED = "EXCEPTION_VIEW_EXPIRED";

	public static final String PERSISTENCE_UNIT_SADC = "sadc";
	public static final String PERSISTENCE_UNIT_P2000 = "p2000";
	public static final String PERSISTENCE_UNIT_CRM = "CRM";

	public static final String TRANSACTION_MANAGER_P2000 = "transactionManagerP2000";
	public static final String TRANSACTION_MANAGER_SADC = "transactionManagerSadc";
	public static final String TRANSACTION_MANAGER_CRM = "transactionManagerCRM";

	public static final Integer TIPO_FORMULARIO_PAGINA = 0;
	public static final Integer TIPO_FORMULARIO_LINK = 1;

	public static final Integer TIPO_CAMPO_PESQUISA_USUARIO_NOME = 1;
	public static final Integer TIPO_CAMPO_PESQUISA_USUARIO_NUMERO_DOC = 2;
	public static final Integer TIPO_CAMPO_PESQUISA_USUARIO_EMPRESA = 3;

	public static final String MENSAGEM_SESSAO_EXPIRADA = "Sessão Expirada.";

	public static final String ATIVO = "1";
	public static final String INATIVO = "0";

	public static final String SCHEDULE_ABA_MES = "Mês";
	public static final String SCHEDULE_ABA_SEMANA = "Semana";
	public static final String SCHEDULE_ABA_DIA = "Dia";

	public static final String TREE_NODE_TYPE_LEAF_TYPE = "leaf";
	public static final String TREE_NODE_TYPE_ACTION_TYPE = "action";

	public static final String CONTEXTO_UPLOAD_ACE = "/uploadAce";

	public static final String INDICADOR_CAPTURA_SIM = "1";
	public static final String INDICADOR_CAPTURA_NAO = "0";

	public static final String INDICADOR_TECNOTOUR = "1";
	public static final String INDICADOR_SEM_TECNOTOUR = "0";

	public static final String INDICADOR_CATEGORIA = "1";

	public static final Integer TIPO_CODIGO_REGISTRO_DOC_RLB = 1;
	public static final Integer TIPO_CODIGO_REGISTRO_DOC_RDI = 2;
	public static final Integer TIPO_CODIGO_REGISTRO_DOC_INT = 3;
	public static final Integer TIPO_CODIGO_REGISTRO_DOC_RDE = 4;

	public static final String SELECTION_MODE_TIPO_TREE_CHECK_BOX = "checkbox";

	public static final String SELECTION_MODE_TIPO_SINGLE = "single";

	public static final String DIRETORIO_FORMULARIO_PRINCIPAL = "principal";
	public static final String DIRETORIO_FORMULARIO_TEMPLATE = "template";

	public static final String DIRETORIO_CONTEXTO_PAGINAS_SADC = "/xhtml/pagina/";
	public static final String DIRETORIO_CONTEXTO_CLASSES_CONTROLADORAS = "/src/main/java/br/com/bb/amb/mb/";
	public static final String DIRETORIO_CONTEXTO_XHTML_PAGINAS = "/src/main/resources/META-INF/resources/xhtml/pagina/";

	public static final int DATATABLE_TAMANHO_FILTER_FUNCTION = 2;

	public static final int MASCARA_TAMANHO_FUNCIONARIO = 8;
	public static final String MASCARA_CPF = "999.999.999-99";
	public static final String MASCARA_PASSAPORTE = "*****?****";
	/**
	 * Mapeado como chave primária da Entidade SadcTipoAcesso
	 */
	public static final long ID_TIPO_ACESSO_PROGRAMADO = 1;
	public static final long ID_TIPO_ACESSO_INCIDENTE = 2;
	public static final long ID_TIPO_ACESSO_TECNOTOUR = 3;
	public static final long ID_TIPO_ACESSO_VISTORIA = 4;
	public static final long ID_TIPO_ACESSO_ORDINARIO = 5;
	public static final long ID_TIPO_ACESSO_INCIDENTE_REGISTRO_POSTERIOR = 6;
	public static final long ID_TIPO_ACESSO_SERVICO = 7;
	public static final long ID_TIPO_ACESSO_EVENTO = 8;

	/**
	 * Mapeado como chave primária da Entidade SadcStatusAcesso
	 */
	public static final long ID_STATUS_ACESSO_AGUARDANDO_AUTORIZACAO = 1;
	public static final long ID_STATUS_ACESSO_AGUARDANDO_ATENDIMENTO = 2;
	public static final long ID_STATUS_ACESSO_EM_ATENDIMENTO = 3;
	public static final long ID_STATUS_ACESSO_CONCLUIDO = 4;

	/**
	 * Mapeado como chave primáriada Entidade SadcCategoria
	 */
	public static final long ID_CATEGORIA_EQUIPAMENTO = 1;
	public static final long ID_CATEGORIA_ACESSORIO = 2;
	public static final long ID_CATEGORIA_DISPOSITIVO_MOVEL = 3;
	public static final long ID_CATEGORIA_MIDIA_REMOVIVEL = 4;

	/**
	 * Mapeado como chave primáriada Entidade SadcSErvico
	 */
	public static final long ID_SERVICO_INSTALACAO = 1;
	public static final long ID_SERVICO_DESINSTALACAO = 2;
	public static final long ID_SERVICO_CAPTURA_IMAGEM = 3;
	public static final long ID_SERVICO_TRANSITO = 4;

	/**
	 * Mapeado como chave primáriada Entidade SadcProprietario
	 */
	public static final Long ID_PROPRIETARIO_BANCO = 1L;
	public static final Long ID_PROPRIETARIO_TERCEIRO = 2L;

	/**
	 * Mapeado como chave primáriada Entidade SadcMenu
	 */
	public static final long ID_MENU_ACESSO = 1;

	public static final String ICON_MENU_LEAF = "fa fa-angle-double-right";
	public static final String ICON_OPEN_FOLDER = "ui-icon-folder-open";

	/**
	 * 
	 */
	public static final long ID_PARAMETRO_SISTEMA = 1;

	public static final String ID_GROWL = "ID_GROWL";

	public static final Integer TAMANHO_TRUNCAMENTO_TEXTO = 30;

	/**
	 * Açães que serão carregadas no admin do SadcObjetoFormulario
	 */
	public static final String ACAO_SALVAR = "acaoSalvar";
	public static final String ACAO_EDITAR = "acaoEditar";
	public static final String ACAO_LIMPAR = "acaoLimpar";
	public static final String ACAO_EDITAR_ACE = "acaoEditarACE";
	public static final String ACAO_SALVAR_ACE = "acaoSalvarACE";
	public static final String ACAO_CANCELAR_ACE = "acaoCancelarACE";
	public static final String ACAO_AUTORIZAR_SEM_CAPTURA_ACE = "acaoAutorizarSemCapturaACE";
	public static final String ACAO_AUTORIZAR_COM_CAPTURA_ACE = "acaoAutorizarComCapturaACE";
	public static final String ACAO_MODELO_ACE = "acaoModeloACE";
	public static final String ACAO_RECUSAR_ACE = "acaoRecusarACE";
	public static final String ACAO_PESQUISAR = "acaoPesquisar";
	public static final String ACAO_IMPRIMIR = "acaoImprimir";
	public static final String ACAO_CREDENCIAR_ACE = "acaoCredenciarACE";
	public static final String ACAO_PENDENCIA_ACE = "acaoPendenciaACE";

	/**
	 * Constantes Status Atualização Acesso
	 */
	public static final long ID_STATUS_ATUALIZACAO_ACESSO_ABERTO = 1;
	public static final long ID_STATUS_ATUALIZACAO_ACESSO_AUTORIZADO = 2;
	public static final long ID_STATUS_ATUALIZACAO_ACESSO_RECUSADO = 3;
	public static final long ID_STATUS_ATUALIZACAO_ACESSO_ANOTACAO = 4;
	public static final long ID_STATUS_ATUALIZACAO_ACESSO_CREDENCIAMENTO = 5;
	public static final long ID_STATUS_ATUALIZACAO_ACESSO_ATENDIDO = 6;
	public static final long ID_STATUS_ATUALIZACAO_ACESSO_VISITANTE_NAO_COMPARECEU = 7;
	public static final long ID_STATUS_ATUALIZACAO_ACESSO_VENCIDO_SEM_AUTORIZACAO = 8;
	public static final long ID_STATUS_ATUALIZACAO_ACESSO_ACESSO = 9;

	public static final int PAGINACAO_50 = 50;
	public static final int PAGINACAO_TABELA = 15;
	public static final int PAGINACAO_TABELA_ACE = 10;

	public static final int TAMANHO_MAXIMO_CARACTERES_FILTRO_DATA_TABLE = 3;

	public static final String TEXTO_URL_PAGINA_ACESSO_INCIDENTE_POSTERIOR = 
			"PAGINASadcAcessoIncidenteRegistroPosterior";

	public static final String PARAMETRO_COMPONENTE_ACESSO_DETALHAR_COMMAND_LINK = 
			"PARAMETRO_COMPONENTE_ACESSO_DETALHAR_COMMAND_LINK";

	public static final String UI_PANEL_TITLE = "ui-panel-title";
	public static final String URL_INTRANET = "https://portal.intranet.bb.com.br/";

	public static final String DATA_FORMATO_ORIGEM = "dd/MM/yyyy HH:mm";
	public static final String DATA_FORMATO_DESTIBO = "yyyy-MM-dd HH:mm";

	public static final String MASCARA_RLB = "RLB99999999999";
	public static final String MASCARA_RDI = "RDI99999999999";
	public static final String MASCARA_INT = "INT99999999999";
	public static final String MASCARA_RDE = "RDE99999999999";

	/**
	 * LDAP
	 */

	public static final String USUARIO_BIND_CHAVE = "gic00usr";
	public static final String USUARIO_BIND_SENHA = "infra53";
	public static final String CAMPO_LDAP_CHAVE = "uid";
	public static final String CAMPO_LDAP_SN = "sn";
	public static final String CAMPO_LDAP_TITLE = "title";
	public static final String CAMPO_LDAP_NOME = "nm-idgl";
	public static final String CAMPO_LDAP_DEPENDENCIA = "cd-uor-dep";
	public static final String CAMPO_LDAP_DEPENDENCIA_PRE = "cd-pref-depe";
	public static final String CAMPO_LDAP_UOR_POSICAO = "cd-eqp";
	public static final String CAMPO_LDAP_CD_REF_ORGC = "cd-ref-orgc";

	/**
	 * parametros do sistema de legado
	 */

	public static final int MATERIAL_TIPO_MATERIAL = 1;
	public static final int MATERIAL_TIPO_EQUIPAMENTO = 2;
	public static final int MATERIAL_TIPO_ACESSORIO = 3;
	public static final int MATERIAL_TIPO_DISPOSITIVO_MOVEL = 4;
	public static final int MATERIAL_TIPO_MIDIA_REMOVIVEL = 5;

	public static final int MATERIAL_TIPO_ENTRADA = 1;
	public static final int MATERIAL_TIPO_SAIDA = 2;
	public static final int MATERIAL_TIPO_ENTRADA_SAIDA = 3;

	public static final String LABEL_CARTAO_DISPONIBILIZADO = "Cartão Disponibilizado";
	public static final String LABEL_VISITANTE_COMPARECEU = "Visitante Compareceu";

	public static final int STATUS_MATERIAL_DESPACHADO = 9001;
	public static final int STATUS_MATERIAL_EMITIDO = 9002;
	public static final int STATUS_MATERIAL_AGUARDANDO_DESPACHO = 4001;
	public static final int STATUS_MATERIAL_VENCIDO = 4002;
	public static final int STATUS_MATERIAL_RECUSADO = 8000;

	public static final String DESCRICAO_AGUARDANDO_AUTORIZACAO = "Aguardando Autoriza\u00E7\u00E3o";

	public static final int STATUS_ACE_VISITANTE_COMPARECEU = 5002;

	public static final String DESCRICAO_TIPO_ACESSO_VISTORIA = "Vistoria";
	public static final String DESCRICAO_TIPO_ACESSO_PROGRAMADO = "Programado";
	public static final String DESCRICAO_TIPO_ACESSO_EMERGENCIAL = "Emergencial";
	public static final String DESCRICAO_TIPO_ACESSO_INCIDENTE = "Incidente";
	public static final String DESCRICAO_TIPO_ACESSO_ORDINARIO = "Ordin\u00E1rio";
	public static final String DESCRICAO_TIPO_ACESSO_INTERACAO = "Servi\u00e7o";
	public static final String DESCRICAO_TIPO_ACESSO_EVENTOS = "Evento";
	public static final String DESCRICAO_TIPO_ACESSO_INCIDENTE_SEM_DOC = "Incidente Registro Posterior";

	public static final String LABEL_DESCRICAO_ORDINARIO_IN = "Ordin\u00E1rio - item IN 775-1";

	public static final String DESCRICAO_ACE_HISTORICO_CADASTRADO = "Cadastrado";
	public static final String DESCRICAO_ACE_HISTORICO_DESPACHADO = "Despachado";
	public static final String DESCRICAO_ACE_HISTORICO_AUTORIZADO = "Autorizado";
	public static final String DESCRICAO_ACE_HISTORICO_AUTORIZACAO = "Autoriza\u00E7\u00E3o";

	public static final String DESCRICAO_HISTORICO_ACE_ANOTACAO = "Anotação";

	public static final int CAMINHO_ARQUIVO_ACE = 1;
	public static final int CAMINHO_ARQUIVO_MAT = 2;

	public static final int TIPO_ANOTACAO_REFERENCIA_MAT_DAQ_CADASTRO = 32;

	public static final int ABA_PESQUISA_LEGADO_ACE = 0;
	public static final int ABA_PESQUISA_LEGADO_MAT = 1;

	public static final String CHAR_SET = Charset.defaultCharset().toString();

	public static final String SADC_SCHEMA = "sadc3";
	public static final String SADC_LEGADO_SCHEMA = "sadc25";
	public static final String P2000_SCHEMA = "dbo";

	public static final String AMBGEDAT = "ambgedat";
	public static final String AMBADMIN = "ambadmin";
	public static final String AMBAUTOR = "ambautor";
	public static final String AMBTECNO = "ambtecno";
	public static final String TRESGUE = "3GUE";

	public static final String URL_HUMANOGRAMA = "https://humanograma.intranet.bb.com.br/avatar/";

	public static final String PF_STATUS_DIALOG_HIDE = "PF('statusDialogTemplate').hide();";

	public static final String MESSAGES = "messages";

	public static final String MASCARA_HORA_MIN = "HH:mm";

	public static final String SADC_ACESSO_DTO = "sadcAcessoDTO";
	public static final String SADC_STATUS_ACESSO_DTO = "sadcStatusAcessoDTO";
	public static final String SADC_TIPO_ACESSO_DTO = "sadcTipoAcessoDTO";
	public static final String SADC_SALA_DTO = "sadcSalaDTO";
	public static final String SADC_COMPLEXO_DTO = "sadcComplexoDTO";
	public static final String SADC_STATUS_ATUALIZACAO_ACESSO_DTO = "sadcStatusAtualizacaoAcessoDTO";
	public static final String SADC_USUARIO_ACESSO_DTO = "sadcUsuarioAcessoDTO";
	public static final String SADC_TRANSITO_MATERIAL_DTO = "sadcTransitoMaterialDTO";
	public static final String SADC_ARQUIVO_ACESSO_DTO = "sadcArquivoAcessoDTO";
	public static final String SADC_ATUALIZACAO_ACESSO_DTO = "sadcAtualizacaoAcessoDTO";
	public static final String SADC_PARAMETRO_SISTEMA_DTO = "sadcParametroSistemaDTO";
	public static final String SADC_TIPO_ACESSO_EXCLUSIVO_DTO = "sadcTipoAcessoExclusivoDTO";

	public static final String SADC_PACOTE_SERVICES = "br.com.bb.amb.services.";
	public static final String NEGOCIO = "Negocio";

	public static final String PACOTE_ARRAYLIST = "java.util.ArrayList";

	public static final String CONTROLADOR = "Controlador";

	public static final String HOSTNAME = "hostName";

	public static final String UL_STYLE_LEFT = "<ul style=\"text-align: left;\">";
	public static final String UL_CLOSE = "</ul>";
	public static final String LI_INFORME_JUSTIFICATIVA = "<li> Informe a justificativa</li>";
	public static final String LI_INFORME_DATAS = "<li> Informe as datas </li>";
	public static final String LI_INFORME_VISITANTES = "<li> Informe o(s) Visitante(s) </li>";
	public static final String LI_INFORME_COMPLEXOS = "<li> Informe o Complexo </li>";
	public static final String LI_DATA_INICIO_FIM_INVALIDAS = "<li> Datas início e (ou) fim inválidas </li>";
	public static final String LI_PERIODO_ANTIGO = "<li> Período muito antigo ou inválido </li>";

	public static final String VALIDAR_DATA_TABLE_ACE_VISITANTES = "validarDataTableAceVisitantes()";
	public static final String GET_ELEMENT_BY_ID_USUARIO_DATA_TABLE_BACKGROUND_COLOR_RED = 
			"document.getElementById('ID_COMPONENTE_USUARIO_DATA_TABLE').style.setProperty('background-color', 'red','important');";

	public static final String ID_COMMAND_BUTTON_EDITAR_USUARIO_ACE = "ID_COMMAND_BUTTON_EDITAR_USUARIO_ACE";
	public static final String ID_PANEL_TRANSITO_DE_ITENS_ACE = "ID_PANEL_TRANSITO_DE_ITENS_ACE";
	public static final String ID_PANEL_DADOS_ACE = "ID_PANEL_DADOS_ACE";
	public static final String ID_PANEL_VISITANTES_ACE = "ID_PANEL_VISITANTES_ACE";
	public static final String ID_PANEL_ANEXOS_ACE = "ID_PANEL_ANEXOS_ACE";
	public static final String ID_PANEL_LOCAL_ACE = "ID_PANEL_LOCAL_ACE";
	public static final String ID_COMPONENTE_LINK_CAMPOS = "ID_COMPONENTE_LINK_CAMPOS";
	public static final String ID_COMPONENTE_FORMULARIO_CAMPOS = "ID_COMPONENTE_FORMULARIO_CAMPOS";
	public static final String ID_COMPONENTE_ACESSO_DATA_INICIO_CALENDAR = "ID_COMPONENTE_ACESSO_DATA_INICIO_CALENDAR";
	public static final String ID_DIV_TRANSITO_MATERIAL_DESTINO_INPUT_TEXT_AREA = "ID_DIV_TRANSITO_MATERIAL_DESTINO_INPUT_TEXT_AREA";
	public static final String ID_DIV_COMPONENTE_TRANSITO_MATERIAL_CAPTURA_MAT_BOOLEAN_CHECK_BOX = 
			"ID_DIV_COMPONENTE_TRANSITO_MATERIAL_CAPTURA_MAT_BOOLEAN_CHECK_BOX";

	public static final String GET_ELEMENT_BY_ID_SAIDA_MATERIAL_INPUT_SWITCH_NAO = 
			"document.getElementById('ID_LABEL_COMPONENTE_TRANSITO_MATERIAL_SAIDA_PREDIO_INPUT_SWITCH').innerHTML = 'Não'";
	public static final String GET_ELEMENT_BY_ID_SAIDA_MATERIAL_INPUT_SWITCH_SIM = 
			"document.getElementById('ID_LABEL_COMPONENTE_TRANSITO_MATERIAL_SAIDA_PREDIO_INPUT_SWITCH').innerHTML = 'Sim'";
	public static final String GET_ELEMENT_BY_ID_SALA_MANY_CHECK_BOX_BORDER_COLOR_RED = 
			"document.getElementById('ID_COMPONENTE_SALA_MANY_CHECK_BOX').style.setProperty('border', 'solid 1px red','important');";
	public static final String GET_ELEMENT_BY_ID_SALA_MANY_CHECK_BOX_BACKGROUND_COLOR_RED = 
			"document.getElementById('ID_LABEL_SALA_MANY_CHECK_BOX').style.setProperty('color', 'red','important');";
	public static final String GET_ELEMENT_BY_ID_DATA_FIM_BORDER_COLOR_RED = 
			"document.getElementById('ID_COMPONENTE_ACESSO_DATA_FIM_CALENDAR').style.setProperty('border', 'solid 1px red','important');";
	public static final String GET_ELEMENT_BY_ID_TERMINO_PLANEJADO_COLOR_RED = 
			"document.getElementById('ID_LABEL_TERMINIO_PLANEJADO').style.setProperty('color', 'red','important');";

	public static final String GET_ELEMENT_BY_ID_DATA_INICIO_BORDER_COLOR_RED = 
			"document.getElementById('ID_COMPONENTE_ACESSO_DATA_INICIO_CALENDAR').style.setProperty('border', 'solid 1px red','important');";

	public static final String GET_ELEMENT_BY_ID_INICIO_PLANEJADO_COLOR_RED = 
			"document.getElementById('ID_LABEL_INICIO_PLANEJADO').style.setProperty('color', 'red','important');";
	

	
	
	
	

	
}
