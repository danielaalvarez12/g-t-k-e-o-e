<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>{{Are you scared of heights?}}</title>
</head>
<body>
    <h1>{{Are you scared of heights?}}</h1>
    <form action="/poll/{{poll.id}}/vote" method="post">
        <ul>
            <li>
                <input type="radio" name="YES" value="YES" required> YES
            </li>
            <li>
                <input type="radio" name="NO" value="NO"> NO
            </li>
            <li>
                <input type="radio" name="I DONT KNOW" value="I DONT KNOW"> I DONT KNOW
            </li>
        </ul>
        <input type="submit" value="Vote">
    </form>
</body>
</html>
