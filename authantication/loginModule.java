/*
package Vault_Application.authantication;

import javax.security.auth.*;
import javax.security.auth.callback.*;
import javax.security.auth.login.*;
import javax.security.auth.spi.LoginModule;

public class loginModule implements LoginModule {
    private Subject subject;
    private CallbackHandler callbackHandler;

    @Override
    public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState, Map<String, ?> options) {
        this.subject = subject;
        this.callbackHandler = callbackHandler;
    }

    @Override
    public boolean login() throws LoginException {
        Callback[] callbacks = new Callback[2];
        callbacks[0] = new NameCallback("Username: ");
        callbacks[1] = new PasswordCallback("Password: ", false);

        try {
            callbackHandler.handle(callbacks);
            String username = ((NameCallback) callbacks[0]).getName();
            char[] password = ((PasswordCallback) callbacks[1]).getPassword();

            // Validate credentials (hardcoded for demo)
            if ("admin".equals(username) && "secret".equals(new String(password))) {
                return true; // Authentication successful
            } else {
                throw new FailedLoginException("Authentication failed");
            }
        } catch (Exception e) {
            throw new LoginException(e.getMessage());
        }
    }

    // Other methods (commit, abort, etc.) are needed but can be minimal for this example
}

*/
