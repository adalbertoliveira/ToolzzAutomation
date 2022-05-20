#language: pt

Funcionalidade: Cadastro de usuario

@cadastro_aluno
Cenario: Cadastrar um novo usuario com sucesso
  Dado que estou na pagina inicial
  Quando eu preencher todos os dados do "<usuario>" e salvar
  Entao o cadastro e realizado com sucesso
  
  Exemplos:
  	| usuario |
  	| aluno   |