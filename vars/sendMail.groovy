void call() {
    emailext attachLog: true, body: '<h1>accentué<h1/>', mimeType: 'text/html', subject: 'subject', to: 'contact@me.com'
}
