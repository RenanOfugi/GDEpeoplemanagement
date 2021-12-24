![](https://img.shields.io/github/license/RenanOfugi/GDEpeoplemanagement)

# GDEpeoplemanagement

## Projeto Bootcamp



## Descrição

**GDEpeoplemanagement** é um projeto de backend utilizando Spring, que visa implementar um pequeno sistema de gerenciamento de **GDEs** utilizando os métodos REST (*GET*, *POST*,*PUT*,*DELETE*), com deploy no serviço em nuvem da Heroku.



## Tecnologias e Ferramentas

Foram utilizado as seguintes tecnologias e ferramentas para o desenvolvimento:
 - Java 11
 - Spring
 - Database H2
 - Heroku
 - Insomnia (pode ser utilizado qualquer outro alternativo)
 - Intellij IDEA



## Executando o projeto

### Localmente

Após fazer o clone deste repositório em sua máquina local, temos duas alternarnativas para realizar a execução:

1. **Com uma IDE Java**. Abra uma IDE e caso o maven esteja corretamente configurado, simplesmente clique no botão de executar normalmente. 
2.  **Por um terminal**, sem o uso da IDE. Neste texto irei descrever a execução em uma distribuição Linux:
   * Abra o terminal e navegue até a pasta que foi clonada
   * Execute `mvn spring-boot:run`

Após esses passos, será criado uma instância executando em `localhost:8080`, onde poderá ser feito as operações dos métodos REST. Utilize ferramentas como o Insomnia ou o Postman, por exemplo. 

### Remoto

Foi realizado o deploy no Heroku deste projeto, ou seja, as operações poderão ser realizados utilizando esta [URL](https://gde-people-management.herokuapp.com)

### Executando um teste POST

Tanto localmente quanto no Heroku, provavelmente não haverá dados. Para realizar inserção via POST, utilize como exemple o seguinte JSON:

```json
{
	"firstName": "Justin",
	"lastName": "Schwartzenberger",
	"phones": [
		{ 
			"type": "HOME",
			"number": "123456789"
		},
		{ 
			"type": "MOBILE",
			"number": "123456789"
		},
		{ 
			"type":"COMMERCIAL",
			"number": "123456789"
		}
	],
	"github": "https://github.com/jschwarty",
	"category": "Angular, Web Technologies (Runtime performance, CSS & DevTools)",
	"googleBiography": "Justin Schwartzenberger is the host of the weekly AngularAir live video broadcast, a frequent conference speaker and an open source contributor. Justin combines a passion for front-end development with a strong back-end skill set."
}
```

## Licença

Este projeto está licenciado sob os termos da [MIT License](https://opensource.org/licenses/MIT)

