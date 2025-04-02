# **Guia de Instalação do Ambiente de Desenvolvimento Java no Windows**

## **1. Instalação do Java Development Kit (JDK)**

Para desenvolver e rodar aplicações Java, é necessário instalar o **JDK (Java Development Kit)**.

### **Passo 1: Baixar o JDK**
1. Acesse o site oficial da Oracle:  
   [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)
2. Escolha a versão mais recente do JDK para Windows.
3. Baixe o instalador compatível com sua arquitetura (x64).

### **Passo 2: Instalar o JDK**
1. Execute o instalador baixado (`jdk-XX_windows-x64_bin.exe`).
2. Siga as instruções na tela, mantendo as opções padrão.
3. Anote o diretório de instalação (exemplo: `C:\Program Files\Java\jdk-XX`).

### **Passo 3: Configurar as Variáveis de Ambiente**
1. Abra o **Painel de Controle** e vá até **Sistema** > **Configurações Avançadas do Sistema**.
2. Clique em **Variáveis de Ambiente**.
3. Em **Variáveis do Sistema**, encontre a variável `Path` e edite-a.
4. Adicione o caminho do JDK:
   ```
   C:\Program Files\Java\jdk-XX\bin
   ```
5. Crie uma nova variável chamada `JAVA_HOME` e defina o valor como o diretório do JDK:
   ```
   C:\Program Files\Java\jdk-XX
   ```
6. Clique em **OK** para salvar.

### **Passo 4: Verificar a Instalação**
Abra o **Prompt de Comando** (`cmd`) e digite:
```
java -version
```
Se a instalação foi bem-sucedida, a versão do Java será exibida.

---

## **2. Configuração de um Projeto Java nos Principais IDEs**

### **2.1 VSCode**
O **Visual Studio Code** é uma opção leve para desenvolvimento Java.

#### **Instalar Extensões**
1. Abra o VSCode e vá para a aba **Extensões** (`Ctrl + Shift + X`).
2. Instale a extensão **Extension Pack for Java** da Microsoft.
3. Reinicie o VSCode.

#### **Criar um Projeto Java**
1. Abra o **Terminal** e execute:
   ```
   mkdir MeuProjeto
   cd MeuProjeto
   code .
   ```
2. No VSCode, abra a aba **Explorer** e clique em **Criar Arquivo**.
3. Nomeie como `Main.java` e adicione:
   ```java
   public class Main {
       public static void main(String[] args) {
           System.out.println("Olá, mundo!");
       }
   }
   ```
4. Para rodar o código, clique no botão **Executar** ou use `Ctrl + F5`.

---

### **2.2 Eclipse**
O **Eclipse** é um dos IDEs mais populares para Java.

#### **Instalar o Eclipse**
1. Baixe o **Eclipse IDE for Java Developers** em:  
   [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/)
2. Execute o instalador e escolha a versão para **Java Developers**.

#### **Criar um Projeto Java**
1. Abra o Eclipse e vá para **File** > **New** > **Java Project**.
2. Dê um nome ao projeto e clique em **Finish**.
3. Dentro do projeto, clique com o botão direito e vá em **New** > **Class**.
4. Nomeie a classe como `Main` e marque a opção `public static void main(String[] args)`.
5. No editor, adicione:
   ```java
   public class Main {
       public static void main(String[] args) {
           System.out.println("Olá, Eclipse!");
       }
   }
   ```
6. Clique com o botão direito no arquivo e selecione **Run As** > **Java Application**.

---

### **2.3 IntelliJ IDEA**
O **IntelliJ IDEA** é um IDE robusto e poderoso para Java.

#### **Instalar o IntelliJ IDEA**
1. Baixe o **IntelliJ IDEA Community Edition** em:  
   [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
2. Instale o IntelliJ seguindo as instruções na tela.

#### **Criar um Projeto Java**
1. Abra o IntelliJ IDEA e selecione **New Project**.
2. Escolha **Java** e selecione o JDK instalado.
3. Clique em **Create** e depois em **Add Java Class**.
4. Nomeie a classe como `Main` e adicione:
   ```java
   public class Main {
       public static void main(String[] args) {
           System.out.println("Olá, IntelliJ!");
       }
   }
   ```
5. Para executar, clique no ícone de **Play** na barra superior.

---

### **2.4 NetBeans**
O **Apache NetBeans** é um IDE clássico para desenvolvimento Java.

#### **Instalar o NetBeans**
1. Baixe o **Apache NetBeans** em:  
   [https://netbeans.apache.org/download/index.html](https://netbeans.apache.org/download/index.html)
2. Durante a instalação, selecione **Java SE**.

#### **Criar um Projeto Java**
1. Abra o NetBeans e vá para **File** > **New Project**.
2. Escolha **Java with Ant** > **Java Application**.
3. Dê um nome ao projeto e clique em **Finish**.
4. No arquivo gerado (`Main.java`), adicione:
   ```java
   public class Main {
       public static void main(String[] args) {
           System.out.println("Olá, NetBeans!");
       }
   }
   ```
5. Para rodar, clique no botão **Run** (`F6`).
