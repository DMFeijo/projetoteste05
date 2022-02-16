#language: pt
#encoding: iso-8859-1

Funcionalidade: Tipo de contratacao de funcionario
 Como um usuario do sistema
 euquero cadastrar o tipo de contratacao de funcionarios
 de modo que eu possa gerenciar funcionarios
 
 Cenario: Definir tipo de contratacao com sucesso
  Dado Acessar a pagina de tipo de contratacao
  E Selecionar o funcionario "Ana Paula dos Santos"
  E Selecionar o tipo de contratacao "CLT"
  Quando Solicitar a atualizacao dos dados
  Então Sistema exibe mensagem de sucesso "Dados atualizados com sucesso"

  