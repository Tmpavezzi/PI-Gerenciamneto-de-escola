/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-21 15:24:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_005faluno_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Alu*****no</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");
      out.write("    <h1>Aluno</h1>\r\n");
      out.write("    <table>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>ID</th>\r\n");
      out.write("            <th>Name</th>\r\n");
      out.write("            <th>Sexo</th>\r\n");
      out.write("            <th>Data Nasc.</th>\r\n");
      out.write("            <th>Estado Civil</th>\r\n");
      out.write("            <th>CPF</th>\r\n");
      out.write("            <th>RG</th>\r\n");
      out.write("            <th>Orgao Emissor</th>\r\n");
      out.write("            <th>Celular</th>\r\n");
      out.write("            <th>Email</th>\r\n");
      out.write("            <th>Endereco</th>\r\n");
      out.write("            <th>Serie</th>\r\n");
      out.write("            <th>Sala</th>\r\n");
      out.write("            <th>Turma</th>\r\n");
      out.write("            <th>Observacao</th>\r\n");
      out.write("            <th>Actions</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /dashboard_aluno.jsp(31,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("aluno");
    // /dashboard_aluno.jsp(31,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/dashboard_aluno.jsp(31,8) '${list}'",_el_expressionfactory.createValueExpression("${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td>${aluno.idAluno}</td>\r\n");
          out.write("                <td>${aluno.nome}</td>\r\n");
          out.write("                <td>${aluno.sexo}</td>\r\n");
          out.write("                <td>${aluno.dataNascimento}</td>\r\n");
          out.write("                <td>${aluno.estadoCivil}</td>\r\n");
          out.write("                <td>${aluno.cpf}</td>\r\n");
          out.write("                <td>${aluno.rg}</td>\r\n");
          out.write("                <td>${aluno.orgaoEmissor}</td>\r\n");
          out.write("                <td>${aluno.celular}</td>\r\n");
          out.write("                <td>${aluno.email}</td>\r\n");
          out.write("                <td>${aluno.endereco}</td>\r\n");
          out.write("                <td>${aluno.serie}</td>\r\n");
          out.write("                <td>${aluno.sala}</td>\r\n");
          out.write("                <td>${aluno.turma}</td>\r\n");
          out.write("                <td>${aluno.observacao}</td>\r\n");
          out.write("                <td>\r\n");
          out.write("                    <form action=\"/delete-aluno\" method=\"post\">\r\n");
          out.write("                        <input type=\"hidden\" id=\"idAluno\" name=\"idAluno\" value=\"${aluno.idAluno}\">\r\n");
          out.write("                        <button type=\"submit\">Delete</button>\r\n");
          out.write("                        <span> | </span>\r\n");
          out.write("                        <a href=\"index_aluno.jsp?idAluno=${aluno.idAluno}&name=${aluno.nome}&sexo=${aluno.sexo}&dataNascimento=${aluno.dataNascimento}&estadoCivil=${aluno.estadoCivil}&cpf=${aluno.cpf}&rg=${aluno.rg}&orgaoEmissor=${aluno.orgaoEmissor}&celular=${aluno.celular}&email=${aluno.email}&endereco=${aluno.endereco}&serie=${aluno.serie}&sala=${aluno.sala}&turma=${aluno.turma}&observacao=${aluno.observacao}\">Update</a>\r\n");
          out.write("                    </form>\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
