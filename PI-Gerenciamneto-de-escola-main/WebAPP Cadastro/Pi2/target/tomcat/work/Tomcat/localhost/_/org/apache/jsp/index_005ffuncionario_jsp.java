/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-21 14:54:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005ffuncionario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    \r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"index_funcionario.css\">\r\n");
      out.write("    <title>Professor</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"menu\">\r\n");
      out.write("    <h1 class=\"titulo-menu\">Sistema de Gerenciamento</h1>\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"principal\">\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"index_funcionario.jsp\">Professores</a> </li>\r\n");
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"index_aluno.jsp\">Alunos </a></li>\r\n");
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"index_instituicoes.jsp\">Instituições</a> </li>\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <ul class=\"secundaria\">\r\n");
      out.write("\r\n");
      out.write("        <li> <a href=\"#paralogin\"> Login</a></li>\r\n");
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("        <li> <a href=\"index.jsp\"> Cadastro</a> </li>\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("<div><h1 class=\"prof\">Professor</h1></div>\r\n");
      out.write("<main>\r\n");
      out.write("    <form class=\"informacao-pessoal\" method=\"post\" action=\"/create-funcionario\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <h1 class=\"infos-pess\">INFORMAÇÕES PESSOAIS</h1>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"nome\">Nome Completo:</label>\r\n");
      out.write("        <input type=\"text\" id=\"nome\" name =\"nome\" class=\"input-padrao\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"sexo\">Sexo:</label>\r\n");
      out.write("        <input type=\"radio\" name=\"sexo\" value=\"Feminino\" id=\"sexo\">Feminino</label>\r\n");
      out.write("        <input type=\"radio\" name=\"sexo\" value=\"masculino\" id=\"sexo\">Masculino</label>\r\n");
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("        <label for=\"dataNascimento\">Data de Nascimento</label>\r\n");
      out.write("        <input type=\"date\" id=\"dataNascimento\" name =\"dataNascimento\">\r\n");
      out.write("\r\n");
      out.write("        <label for=\"estadoCivil\">Estado Civil:</label>\r\n");
      out.write("        <input type=\"text\" id=\"estadoCivil\" name =\"estadoCivil\" class=\"input-padrao\" required>\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"cpf\">CPF:</label>\r\n");
      out.write("        <input type=\"cpf\" id=\"cpf\"name =\"cpf\" class=\"input-padrao\" required placeholder=\"Digite o CPF\">\r\n");
      out.write("\r\n");
      out.write("        <label for=\"rg\">RG:</label>\r\n");
      out.write("        <input type=\"rg\" id=\"rg\" name=\"rg\" class=\"input-padrao\" required placeholder=\"Digite o RG\">\r\n");
      out.write("\r\n");
      out.write("        <label for=\"orgaoEmissor\">Orgão Emissor:</label>\r\n");
      out.write("        <input type=\"text\" id=\"orgaoEmissor\" name=\"orgaoEmissor\"class=\"input-padrao\" required>\r\n");
      out.write("        <br>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"celular\">Celular:</label>\r\n");
      out.write("        <input type=\"telefone\" id=\"celular\" name =\"celular\" class=\"input-padrao\" required placeholder=\"(DDD)00000-0000\">\r\n");
      out.write("\r\n");
      out.write("        <label for=\"email\">Email:</label>\r\n");
      out.write("        <input type=\"email\" id=\"email\" name =\"email\" class=\"input-padrao\" required>\r\n");
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("        <label for=\"endereco\">Endereco:</label>\r\n");
      out.write("        <input type=\"text\" id=\"endereco\" name =\"endereco\" class=\"input-padrao\" required>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <h1 class=\"infos-pess\">INFORMAÇÕES COMPLEMENTARES</h1>\r\n");
      out.write("        <label for=\"cargo\">Cargo:</label>\r\n");
      out.write("        <input type=\"text\" id=\"cargo\" name=\"cargo\" class=\"input-padrao\" required>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"graduacao\">Graduação:</label>\r\n");
      out.write("        <input type=\"text\" id=\"graduacao\" name=\"graduacao\" class=\"input-padrao\" required>\r\n");
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("        <label for=\"conhecimento\">Área do Conhecimento:</label>\r\n");
      out.write("        <input type=\"text\" id=\"conhecimento\" name=\"conhecimento\" class=\"input-padrao\" required>\r\n");
      out.write("\r\n");
      out.write("        <h2 class=\"infos-pess\">OBSERVAÇÕES</h2>\r\n");
      out.write("\r\n");
      out.write("        <textarea name=\"observacao\" id=\"observacao\" cols=\"100\" rows=\"8\" class=\"area-texto\"></textarea>\r\n");
      out.write("\r\n");
      out.write("        <input type=\"submit\" value=\"Cadastrar\" class=\"cads\">\r\n");
      out.write("        <input type=\"submit\" value=\"Cancelar\" class=\"cancel\">\r\n");
      out.write("    </form>\r\n");
      out.write("</main>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
