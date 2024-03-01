# Entenda oque é?

o padrão **Singleton** é um padrão de design criacional que permite garantir que uma classe tenha apenas uma instância, ao mesmo tempo que fornece um ponto de acesso global para essa instância.

# Como assim?

### Exemplo utilizando nosso dia dia

Vamos supor que você é controlador de uma torre de trafego aéreo e sua função é intermediar os aviões para nao colidirem…

### como seria feito?

Distribuindo os aviões para rotas diferentes ou seja quando houver um avião na rota outro nao poderá estar na mesma.

### Como ficaria esta solução em código ?

Classes:

- Rota
- Teste

### Classe Rota:

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/864fd978-761f-4aab-98e0-191d083e5437/9e330181-e517-44f8-aee7-5245555c022a/Untitled.png)

### **Classe Teste**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/864fd978-761f-4aab-98e0-191d083e5437/617ca7de-61eb-4fca-87cd-c2fe48fa1009/Untitled.png)

### **Console:**

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/864fd978-761f-4aab-98e0-191d083e5437/cb7ec845-c23e-4a53-838d-3dcf0bafc45b/Untitled.png)

Explicando console :

Quando instanciamos o primeiro avião(Airbus) na rota diremos a todas as outras tentativa de instanciar um novo avião na rota que não será possível pois está ocupada a rota…

podemos ver isso no nosso console acima 

Link do arquivo:

https://github.com/varelaprogramador/Padrao-de-projeto---Singletone

[Padraosingle - Google Drive](https://drive.google.com/drive/folders/1bjpOMDZOq7lobq-NYa7s02YPcoqICDIQ?usp=drive_link)

Link para estudos:

[Design Patterns #03: Singleton](https://youtu.be/F9D6yJPzk2s?si=u7k5QteqQ6OH__PK)

[Singleton](https://refactoring.guru/design-patterns/singleton)
