## COFFEHOUSE :coffee:
O seguinte projeto é o backend de uma cafeteria (fictícia) com propósitos de aprendizado
utiliza recursos de cloud computing como upload de arquivos no amazon S3
e salva dados no DynamoDB
## Rodando o projeto localmente
Primeiramente crie um bucket no s3 e um usuário IAM com permissão de leitura e escrita no bucket especifico
em seguida recupere as credenciais do usuário (ACCESS_KEY_ID e SECRET_ACCESS_KEY) e as passe como parâmetro para a JVM
juntamente com o BUCKET_NAME
na configuração da IDE.
## Requisitos
 * Conta AWS
 * Java 17

