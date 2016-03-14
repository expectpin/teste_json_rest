# ws-poc
Exemplo de projeto de desenvolvimento de API REST em JAVA com front-end em Angular JS

Pré-requisitos:

Maven, 
Servidor WildFly 9.x;


Passo a passo:
Baixar o projeto;
Na pasta raiz do projeto, executar o comando 'mvn clean install';
Copiar o arquivo "ws-poc/target/ws-poc****.war" para a pasta de deploy do wildfly (...\wildfly-9.0.2.Final\standalone\deployments);
Copiar o arquivo sdandalone.xml para a pasta de configuracao do wildfly (..\wildfly-9.0.2.Final\standalone\configuration);
Iniciar o servidor (..\wildfly-9.0.2.Final\bin\standalone.bat).


*Adicionar este plugin no firefox para permitir requisições externas - https://addons.mozilla.org/pt-BR/firefox/addon/cors-everywhere/
**Testes feitos no Firefox.
