# Sistema de Controle de Versão 

## Configuração inicial para o uso do Git 

Para utilizar o Git corretamente é necessário configurar o nome do usuário e e-mail.
Essas informações são utilizadas para identificar o autor de cada commit realizado no repositório.

## Configuração de nome de usuário e e-mail no Git

Para configurar o nome de usuário e o e-mail globalmente no Git, utilize os seguintes comandos:

```bash
git config --global user.name "Seu nome"
git config --global user.email "seuemail@mail.com"
```

## Criando Personal Access Token (PAT) no GitHub

O Personal Access Token (PAT) é uma forma de autenticação utilizada pelo GitHub no lugar da senha.
Atualmente, o GitHub não permite mais autenticação por senha via HTTPS, sendo necessário utilizar um token para realizar operações como push e pull.

Passos para criar um PAT no GitHub:

> >1. Acesse sua conta no GitHub.
> >2. Clique na sua foto de perfil e vá em **Settings**.
> >3. Selecione **Developer settings**.
> >4. Clique em **Personal access tokens**.
> >5. Escolha **Tokens (classic)**.
> >6. Clique em **Generate new token**.
> >7. Selecione as permissões necessárias (marque a opção **repo**).
> >8. Clique em **Generate token**.
> >9. Copie o token gerado e guarde em local seguro.


## Salvar em cache as credenciais do PAT 

O comando
git config --global credential.helper 'cache --timeout=3600' configura o Git para armazenar suas credenciais de autenticação (usuário e senha/token) na memória RAM por 1 hora (3600 segundos). Isso evita ter que digitar a senha a cada comando Git (push/pull), sendo mais seguro que salvar em arquivo, pois os dados somem ao reiniciar ou após o tempo limite. 

Para salvar as credenciais por 1 hora (3600 segundos), utilize o seguinte comando:


```bash
git config --global credential.helper'cache --timeout=3600'
```

## Qual a diferença entre git merge e git rebase? 

Tanto o Git rebase quanto o Git merge são métodos para integrar alterações de um branch em outro. A principal diferença é que o **rebase** sobrescreve o histórico de um branch, enquanto o **merge** preserva o histórico de ambos os branches.
