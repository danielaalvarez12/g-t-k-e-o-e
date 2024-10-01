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
                <input type="YES" name="YES" value="YES" required> YES
            </li>
            <li>
                <input type="NO" name="NO" value="NO"> NO
            </li>
            <li>
                <input type="I DONT KNOW" name="I DONT KNOW" value="I DONT KNOW"> I DONT KNOW
            </li>
        </ul>
        <input type="submit" value="Vote">
    </form>
</body>
</html>
    <!DOCTYPE><https://danielaalvarez12.github.io/poll/%7B%7Bpoll.id%7D%7D/vote>>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thank You for Voting!</title>
</head>
<body>
    <h1>Thank You for Your Vote!</h1>
    <p>Your vote has been successfully recorded.</p>

    <h2>Poll Results:</h2>
    <ul>
        <li>YES: {{poll.options[YES]}} votes</li>
        <li>NO: {{poll.options[NO]}} votes</li>
        <li>I DONT KNOW: {{poll.options[I DONT KNOW]}} votes</li>
    </ul>

    <a href="/poll/{{poll.id}}">Back to Poll</a>
</body>
</html>

