# Sistema de Controle de Versão

##  Configuração inicial para o uso do Git

É necessário configurar seu nome de usuário e e-mail no Git para que o sistema possa **identificar o autor dos commits**. Essa configuração é global e deve ser feita através do terminal com os seguintes comandos: 

```bash
git config --global user.name "nomeUsuario"
git config --global user.email "emailUsuario@..."
```

Uma observação importante é que, com o comando abaixo, você pode confirmar qual usuário está configurado atualmente no Git:

```bash
git config --global --list
```

## Criando Personal Access Token (PAT) no GitHub

Um **Personal Access Token (PAT)** é uma chave de autenticação que substitui o uso de senhas no GitHub, especialmente em operações via linha de comando, API ou ao usar Git via HTTPS. Ele funciona como uma credencial segura e configurável, permitindo definir permissões especificas para cada token.

> ### Por que criar um PAT?
>  É a forma mais moderna, segura e flexivel de autenticar no GitHub, substituindo senhas tradicionais e protegendo melhor seus repositórios e dados.


Para criar um **PAT**, siga estes passos:

1. Acesse as configurações do seu perfil no GitHub em: https://github.com/settings/tokens.

2. Gere um novo token (classic) e, no campo de nota, identifique o uso (ex: "Aula de POO").

3. Importante: Ao selecionar os escopos (permissões), certifique-se de marcar a opção repo, que garante controle total sobre seus repositórios.

4. Copie o token gerado e guarde-o em um local seguro, pois ele não será exibido novamente.


---

## **Salvar em cache as credenciais do PAT** 

A motivação para salvar as credenciais em cache é a praticidade, evitando que você precise digitar ou colar o seu PAT toda vez que realizar uma operação que exija autenticação (como git push ou git pull).

**Para configurar o Git para armazenar suas credenciais na memória por 1 hora (3600 segundos), utilize o comando abaixo:**


```bash
git config --global credential.helper 'cache --timeout=3600'
```
### **Qual a diferença entre git merge e git rebase?**

- **_git merge :_** Une o histórico de duas ramificações criando um **novo commit de mesclagem (merge commit)**. Ele preserva o histórico exato de quando as ramificações foram criadas e unidas.

    ![alt text](image-1.png)


 
 
 - **_git rebase :_**  "Reescreve" o histórico ao mover a base da sua ramificação atual para o final de outra ramificação (como **main**). Isso cria um **histórico liner**, e altera os identificadores (hashes) dos commits originais.

    ![alt text](image-2.png)



 ### **Quando usar cada um?**

- Use **_merge_** quando quiser preservar o histórico completo e mostrar claramente onde as branches se encontraram. É mais seguro em projetos com várias pessoas. 

 - Use **_rebase_** quando quiser manter um histórico limpo e linear, especialmente em trabalhos individuais ou antes de compartilhar a branch com outros. 