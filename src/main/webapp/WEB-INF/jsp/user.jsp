<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Peerius Test</title>
      <meta charset="utf-8">
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
      <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

<div class="panel panel-default">
  <div class="panel-heading">Panel heading without title</div>
  <div class="panel-body">
    <form:form method="POST" action="/user">
        <div>
            <div><form:label path="firstName">First Name</form:label></div>
            <div><form:input path="firstName" /></div>
        </div>
        <div>
            <div><form:label path="lastName">Last Name</form:label></div>
            <div><form:input path="lastName" /></div>
        </div>
        <div>
        <div>
                    <input type="submit" value="Submit" class="btn btn-default"/>
                </div>
                </div>
    </table>
    </form:form>
  </div>
</div>


</div>
</body>
</html>