####Sample modification 'standalone' file, to add security realm.

```xml
<server xmlns="urn:jboss:domain:2.1">
    ...
    <profile>
        ... 
        <subsystem xmlns="urn:jboss:domain:security:1.2">
            ...
            <security-domains>
                ...
                <security-domain name="MyRealm">
                    <authentication>
                        <login-module code="RealmDirect" flag="required">
                            <module-option name="password-stacking" value="useFirstPass"/>
                        </login-module>
                    </authentication>
                </security-domain>
                ...
            </security-domains>
            ...
        </subsystem>
        ...
    </profile>
    ...
</server>
```

####Login: 
POST http://127.0.0.1:8080/jee7-rest-auth/rest/auth
```json
{
"login": "admin",
"password" : "admin"
}
```

####Logout:
DELETE http://127.0.0.1:8080/jee7-rest-auth/rest/auth

####Secure Content: 
GET http://127.0.0.1:8080/jee7-rest-auth/rest/hello