#language: pt
#encoding: iso-8859-1

Funcionalidade: Cadastrar Funcionarios
 como umusuario do sistema
 eu quero cadstrar Funcionarios
 para que eu possa gerenciar Funcionarios

Cenário: Cadastro de funcionario com sucesso
 Dado Acessar a pagina de cadastro de funcionario
 E informar o nome do funcionario "Daniel Feijo"
 E informar o cpf do funcionario "123.123.123-12" 
 E informar a data de admisão do funcionario "01/01/2022"
 E informar o resumo de atividades do funcionario "Analista de testes"
 Quando Solicitar a realizacão do cadastro do funcionario
 Então sistema exibe mensagem "Funcionário cadastrado com sucesso"

Cenario: Validacão de campos obrigatorios
 Dado Acessar a pagina de cadastro de funcionario
 Quando Solicitar a realizacão do cadastro do funcionario
 Então Sistema informa que cada campo e de preenchimento obrigatorio