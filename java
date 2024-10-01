<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>{{Are you scared of heights?}}</title>
</head>
<body>
    <h1>{{poll.question}}</h1>
    <form action="/poll/{{poll.id}}/vote" method="post">
        <ul>
            <li>
                <input type="radio" name="option" value="YES" required> Option 1
            </li>
            <li>
                <input type="radio" name="option" value="NO"> Option 2
            </li>
            <li>
                <input type="radio" name="option" value="I DONT KNOW"> Option 3
            </li>
        </ul>
        <input type="submit" value="Vote">
    </form>
</body>
</html>
