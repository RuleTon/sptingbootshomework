<html xmlns:th="http://www.thymeleaf.org">


<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Product</title>

</head>
<body>

<h1>Product servlet</h1><br />

<h2>Все продукты</h2><br />

<table th:if="${frontBoxes.size() > 0}" class="table">
    <thead>
    <tr>
        <td>ID</td>
        <td>Название</td>
        <td>Цена</td>
    </tr>
    </thead>
    <tbody>

    <tr th:each="b :${frontBoxes}">
        <td th:text="${Products.id}"></td>
        <td th:text="${Products.product}"></td>
        <td th:text="${Products.cost}"></td>

</table>


<c:forEach var="Products" items="${requestScope.Products}">
    <ul>

        <li>ID: <c:out value="${product.id}"/></li>

        <li>Наименование: <c:out value="${product.name}"/></li>

        <li>Цена: <c:out value="${product.cost}"/></li>
    </ul>
    <hr />

</c:forEach>

<h2>Добавление нового продукта</h2><br />

<form method="post" action="">

    <label><input type="number" name="id"></label>ID<br>

    <label><input type="text" name="name"></label>Наименование продукта<br>

    <label><input type="number" name="cost"></label>Цена<br>

    <input type="submit" value="Ok" name="Ok"><br>
</form>

</body>
</html>