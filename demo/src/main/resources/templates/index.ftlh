<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Пользователи</title>
</head>
<body>
<h1>Пользователи сайта</h1>
<div>
    <h3> Добавить новых пользователей</h3>
    <form action="index/create" method="post">
        Имя: <input type="text" name="firstname">
        Фамилия: <input type="text" name="lastname">
        Возраст: <input type="text" name="age">
        Телефон: <input type="text" name="phone">
        <input type="submit" value="Сохранить">
    </form>
</div>
<div>
    <h3> Обновить данные пользователя</h3>
    <form action="index/update" method="post">
        id: <input type="text" name="id">
        Имя: <input type="text" name="firstname">
        Фамилия: <input type="text" name="lastname">
        Возраст: <input type="text" name="age">
        Телефон: <input type="text" name="phone">
        <input type="submit" value="Обновить">
    </form>
</div>
<div>
    <h3> Удалить пользователя</h3>

    <form action="/index/delete/" method="post">
        id: <input type="text" name="id">
        <input type="submit" value="Удалить">
    </form>
</div>


<#list users as user>
    <div>
        <p>id: ${user.id}</p>
        <p>Имя: ${user.firstname}</p>
        <p>Фамилия: ${user.lastname}</p>
        <p>Возраст: ${user.age}</p>
        <p>Телефон: ${user.phone}</p>
    </div>
</#list>
</body>
</html>