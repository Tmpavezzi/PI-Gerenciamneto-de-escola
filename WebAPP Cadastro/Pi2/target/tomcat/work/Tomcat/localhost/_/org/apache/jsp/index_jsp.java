/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-24 23:16:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"index.css\">\r\n");
      out.write("    <title>Cadastro</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <nav class=\"menu\">\r\n");
      out.write("        <h1 class=\"titulo-menu\">Sistema de Gerenciamento</h1>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"principal\">\r\n");
      out.write("            <li><a href=\"index_funcionario.jsp\">Professores</a></li>\r\n");
      out.write("            <br>\r\n");
      out.write("            <li><a href=\"index_aluno.jsp\">Aluno </a></li>\r\n");
      out.write("            <br>\r\n");
      out.write("            <li><a href=\"index_instituicao.jsp\">Instituições</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"secundaria\">\r\n");
      out.write("            <li> <a href=\"#index.jsp\">Login</a></li>\r\n");
      out.write("            <br>\r\n");
      out.write("            <li> <a href=\"index_cadastro.jsp\">Cadastro</a> </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\" >\r\n");
      out.write("        <a class=\"links\" id=\"paracadastro\"></a>\r\n");
      out.write("        <a class=\"links\" id=\"paralogin\"></a>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("        <!--FORMULÁRIO DE LOGIN-->\r\n");
      out.write("            <div id=\"login\">\r\n");
      out.write("                <form method=\"post\" action=\"/create-cadastro\">\r\n");
      out.write("                    <h1 class=\"titulo-cad\">Login</h1>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"email_login\">Seu e-mail</label>\r\n");
      out.write("                        <input id=\"email_login\" name=\"email_login\" required=\"required\" type=\"text\" placeholder=\"seuemail@dominio.com\"/>\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"senha_login\">Sua senha</label>\r\n");
      out.write("                        <input id=\"senha_login\" name=\"senha_login\" required=\"required\" type=\"password\"  />\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <input type=\"checkbox\" name=\"manterlogado\" id=\"manterlogado\" value=\"\" />\r\n");
      out.write("                        <label for=\"manterlogado\">Manter-me logado</label>\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <input type=\"submit\" value=\"Logar\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <p class=\"link\">Ainda não tem conta?<a href=\"#paracadastro\">Cadastre-se</a></p>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!--FORMULÁRIO DE CADASTRO-->\r\n");
      out.write("            <div id=\"cadastro\">\r\n");
      out.write("                <form method=\"post\" action=\"/create-cadastro\">\r\n");
      out.write("                    <h1 class=\"titulo-cad\">Cadastro</h1>\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"nome\">Seu nome</label>\r\n");
      out.write("                        <input type=\"text\" id=\"nome\" name=\"nome\" required=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cadastro.nome}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"email\">Seu e-mail</label>\r\n");
      out.write("                        <input id=\"email\" name=\"email\" required=\"required\" type=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cadastro.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" placeholder=\"seuemail@dominio.com\"/>\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <label for=\"senha\">Sua senha</label>\r\n");
      out.write("                        <input id=\"senha\" name=\"senha\" required=\"required\" type=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cadastro.senha}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("                    </p>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"hidden\" id=\"idCadastro\" name=\"idCadastro\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.idCadastro}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <input type=\"submit\" value=\"Cadastrar\"/>\r\n");
      out.write("                    </p>\r\n");
      out.write("                        <p class=\"link\">Já tem conta?<a href=\"#paralogin\"> Ir para Login </a></p>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
