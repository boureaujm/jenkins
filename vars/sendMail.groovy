void call() {
    String body = '''
    <!DOCTYPE html>
<html>
<body>

<h1>accentué</h1>
<p>My first paragraph.</p>

</body>
</html>'''
    emailext attachLog: true, body: body, mimeType: 'text/html', subject: 'subject', to: 'contact@me.com'
}
