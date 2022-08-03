<h2>Ferramentas usadas: Java 18, Spring Boot 3.0.0(M4), MongoDB</h2>

<h1>App Linguagens</h1>

<p>Aplicativo que lê APIs remotamente de um banco de dados e sobe a API para um endereço web especificado pelo usuário no código. </p>

<p>A configuração padrão está setada para ler uma API que mostra as linguagens de programação de acordo com um ranking, feito pelo próprio autor, apenas para demonstração de uso. </p>

<p>O projeto foi feito como exercício conjunto proposto pelo grupo Alura, no evento Imersão Java.  </p>

<p>Nesta versão, o código está todo comentado com instruções que serão mostradas neste README para facilitar o uso. </p>

<h2>Requisitos</h2>

<p>Para rodar o código em sua IDE, é necessário ter Java 18 instalado, assim como uma IDE com os pacotes Java. É necessário ter uma API, do tipo JSON, em algum banco de dados em nuvem ou local. </p>



<h2>Como usar (caso estiver usando MongoDB): </h2>

1. Após criar sua collection no banco de dados, vá para a classe Linguagem.java, e, na linha 7, mude o nome da collection para a sua própria.

    ![Collection name](https://imgur.com/YhkpoWHl.png)

2. Neste projeto, o app lê os atributos title, image e ranking. Caso queira adicionar ou remover atributos do seu arquivo JSON, não se esqueça de alterar os atributos nessa classe também, assim como seus retornos no construtor Linguagem.

    ![Collection name](https://imgur.com/ltPytM7l.png)
    
    ![Collection name](https://imgur.com/OyOGO0El.png)

3. De acordo com a necessidade do usuário, pode-se estar mudando o caminho do link pela classe LinguagemController.java, nas anotações GetMapping e PostMapping. Apenas trocar /linguagens por /seu-link-aqui.

    ![Collection name](https://imgur.com/gEdm0wGl.png)

4. Pelo projeto ter sido criado e compilado para funcionar no Java 18, pode ser que algumas máquinas dêem erro de versão, pois o Java 17 não conseguiria rodar pelo prompt de comando, por exemplo. Para resolver isso, setar o JAVA_HOME da sua máquina para usar o Java 18. Ilustração do erro abaixo:

    ![Collection name](https://imgur.com/hObngzwl.png)


<strong>Todos os agradecimentos ao grupo Alura pela oportunidade de projeto.</strong>

- Código feito no evento Imersão Java, do grupo Alura.
- Comentários no código por Rafael Muzulon Freitas
