#language: pt
#encoding: iso-8859-1

Funcionalidade: Cadastrar Funcionarios
 como umusuario do sistema
 eu quero cadstrar Funcionarios
 para que eu possa gerenciar Funcionarios

Cen�rio: Cadastro de funcionario com sucesso
 Dado Acessar a pagina de cadastro de funcionario
 E informar o nome do funcionario "Daniel Feijo"
 E informar o cpf do funcionario "123.123.123-12" 
 E informar a data de admis�o do funcionario "01/01/2022"
 E informar o resumo de atividades do funcionario "Analista de testes"
 Quando Solicitar a realizac�o do cadastro do funcionario
 Ent�o sistema exibe mensagem "Funcion�rio cadastrado com sucesso"

Cenario: Validac�o de campos obrigatorios
 Dado Acessar a pagina de cadastro de funcionario
 Quando Solicitar a realizac�o do cadastro do funcionario
 Ent�o Sistema informa que cada campo e de preenchimento obrigatorio