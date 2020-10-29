
<%@page import="java.sql.*"%>
<%@page import="config.Conexao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link href="css/css.css" rel="stylesheet">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<%
    
    Statement st = null;
    ResultSet rs = null;
   %>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
    <div id="login">
        <h3 class="text-center text-white pt-5">Formulário de Login</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="index.jsp" method="post">
                            <h3 class="text-center text-info">Login</h3>
                            <div class="form-group">
                                <label for="username" class="text-info">Usuário</label><br>
                                <input type="text" name="email" id="email" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Senha</label><br>
                                <input type="text" name="senha" id="senha" class="form-control">
                            </div>
                            <div class="form-group">
                                
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="Login">
                            </div>
                            <p>
                             <%
                                    String user = request.getParameter("email");
                                    String pass = request.getParameter("senha");
                                    String nomeUsuario = "";
                                    String usuario = "";
                                    String senha = "";
                                    int i = 0;

                                    try{
                                        
                                        
                                        st = new Conexao().conectar().createStatement();
                                        rs = st.executeQuery("SELECT * FROM cadastros WHERE email = '"+ user +"' and senha = '" + pass + "'");
                                        while(rs.next()){
                                            nomeUsuario = rs.getString(2);
                                            usuario = rs.getString(3);
                                            senha = rs.getString(4);                        
                                            rs.last();
                                            i = rs.getRow();
                                        }

                                    }catch(Exception e){
                                        out.println(e);
                                    }

                                    if(user == null || pass == null){
                                        out.println("PREENCHER OS DADOS");
                                    } else{
                                        if(i>0){
                                            session.setAttribute("nomeUsuario", nomeUsuario);
                                            response.sendRedirect("restrito.jsp");
                                        }
                                    }
                %>
                            </p>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>