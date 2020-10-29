<%@page import="java.sql.*"%>
<%@page import="config.Conexao"%>
<%@page import="com.mysql.jdbc.Driver"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
integrity="sha384-
DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
crossorigin="anonymous"></script>
<script
src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.m
in.js" integrity="sha384-
9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
crossorigin="anonymous"></script>
<script
src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.
min.js" integrity="sha384-
w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s"
crossorigin="anonymous"></script>

 <meta http-equiv="Content-Type" content="text/html;
charset=UTF-8">
 <link rel="stylesheet"
href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstr
ap.min.css" integrity="sha384-
JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
crossorigin="anonymous">
 <title>Projeto JAVA Web</title>
 </head>
 <body>
 <nav class="navbar navbar-expand-lg navbar-light bg-light">
 <a class="navbar-brand" href="#">Lista de Usuários</a>
 <button class="navbar-toggler" type="button" datatoggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" arialabel="Toggle navigation">
 <span class="navbar-toggler-icon"></span>
 </button>
 <div class="collapse navbar-collapse"
id="navbarSupportedContent">
 <ul class="navbar-nav mr-auto">
 <li class="nav-item active">
 <a class="nav-link" href="#">Home <span
class="sr-only">(current)</span></a>
 </li>
 <li class="nav-item">
 <a class="nav-link" href="#">Link</a>
 </li>
 <li class="nav-item">
 <a class="nav-link disabled" href="#"
tabindex="-1" aria-disabled="true">Disabled</a>
 </li>
 </ul>
 <form class="form-inline my-2 my-lg-0">
 <%
 String usuarioSessao = (String)
session.getAttribute("usuarioSessao");
 out.println("Olá: &nbsp; <b> " +
usuarioSessao + "</b>&nbsp;");
 out.println("<hr>");
 if (usuarioSessao == null) {
 response.sendRedirect("index.jsp");
 }   %>
 <a href="logout.jsp">
 <input type="button" class="btn btn-outlinedanger my-2 my-sm-0" value="SAIR" />
 </a>
 </form>
 </div>
 </nav>
 
 <div class="row mt-4 mb-4">
 <button class="btn-info">Novo Usuário</button>
 <form class="form-inline my-2 my-lg-0">
 <input class="form-control mr-sm-2" type="search"
name="txtbuscar" placeholder="Digite um nome" aria-label="Search">
 <button class="btn btn-outline-info my-2 my-sm-0"
type="submit">Buscar</button>
 </form>
</div>

 <div class="container">    
 <table class="table table-striped">
 <thead>
 <tr>
 <th scope="col">ID</th>
 <th scope="col">Nome</th>
 <th scope="col">Email</th>
 <th scope="col">Senha</th> 
 <th scope="col">Nível</th>
 </tr>
 </thead>
 <tbody>
     <%
         Statement st = null;
         ResultSet rs = null;
         String id_usuario = "";
         String nome_usuario = "";
         String email_usuario = "";
         String senha_usuario = "";
         String nivel_usuario = "";
         
         try {
             
             st = new Conexao().conectar().createStatement();
             rs = st.executeQuery("SELECT * FROM usuarios ");
             while (rs.next()) {
                %>
                 <tr>
                 <td><%= rs.getString(1)%></td>
                 <td><%= rs.getString(2)%></td>
                 <td><%= rs.getString(3)%></td>
                 <td><%= rs.getString(4)%>/td>
                 <td><%= rs.getString(5)%></td>
                 </tr>
                 <%
             }
          } catch (Exception e) {
              out.println(e);
          }
         %>
 
 
 
 </tbody>
 </table>
 </div>
 </body>
</html>




<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
        <form id="cadastro-form" class="form" action="" method="post">
      <div class="modal-body">
          
          <h3 class="text-center text-info"> Cadastro de Novo Usuário</h3>
          <div class="form-group">
              <label for="nome" class="text-info">Nome:</label></br>
              <input type="text" name="nome" id="nome" class="form-control" required>
      </div>
          <div class="form-group">
             <label for="email" class="text-info">Email:</label></br>
             <input type="text" name="email" id="email" class="form-control" required> 
          </div>
          <div class="form-group">
             <label for="senha" class="text-info">Senha:</label></br>
             <input type="text" name="senha" id="senha" class="form-control" required> 
          </div>
          <div class="form-group">
             <label for="exampleFormControlSelect1">Nível:</label></br>
             <select class="form-control" name="txtNivel" id="txtNivel"> 
                 <option>Comum</option>
                 <option>Administrador</option>
             </select>    
          </div>
      <div class="modal-footer"> 
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
        <button type="submit" name="btn-salvar" class="btn btn-primary">Salvar</button>
      </div>
        </form>
      </div>
    </div>
  </div>
</div>

<%
   if(request.getParameter("btn-salvar") != null){
       String nome = request.getParameter("nome");
       String email = request.getParameter("email");
       String senha = request.getParameter("senha");
       String nivel = request.getParameter("nivel");
       
       try {
           st = new Conexao().conectar().createStatement();
           
           rs = st.executeQuery("SELECT * FROM usuarios WHERE email = '" + email + "' ");
           while (rs.next()) {
               rs.getRow();
               if(rs.getRow() > 0){
                   out.print("<script>alert('Usuário já cadastrado!');</script>");
               }
           }
           
           st.executeUpdate("INSERT INTO usuarios (nome, email, senha, nivel) " + "VALUES ('" + nome + "','" + email + "','" + senha + "','" + nivel + "')");
           response.sendRedirect("restrito.jsp");
           
       }
       
       catch (Exception e) {
           out.println(e);
       }
       
       
   } 

%>