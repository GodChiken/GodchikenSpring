# https를 사용하려면 ssl을 사용해야한다. keystore를 만들어야한다.
keytool -genkey -alias tomcat -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore keystore.p12 -validity 4000