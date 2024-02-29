function validateLogin() {
    var username = document.getElementById('Uname').value;
    var password = document.getElementById('Pass').value;

    // Check if username and password are not empty
    if (username === '' || password === '') {
        document.getElementById('error-message').innerText = 'Username and password are required!';
    } else {
        // For simplicity, let's assume valid credentials are 'user' and 'password'
        if (username === 'jeeva' && password === 'jeevaks2005') {
            document.getElementById('error-message').innerText = 'Login successful!';
            window.location='filename';
        } else {
            document.getElementById('error-message').innerText = 'Invalid username or password.';
        }
    }
}
