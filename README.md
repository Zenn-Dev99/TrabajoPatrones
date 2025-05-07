Riquelme Medina IGR 0058
Infante Zuñiga IGR 0058

Explicación de patrones aplicados:

•	Singleton: Se implementó en la clase ConfiguracionEvento para asegurar que solo exista una única configuración del evento en toda la aplicación. Esto se logró creando una instancia estática y un constructor privado, 
y controlando el acceso mediante el método getInstancia().

•	Prototype: Se aplicó en la clase CredencialEvento, donde se creó una plantilla base que puede clonarse mediante el método clone(). Esto permite crear múltiples credenciales personalizadas de forma eficiente.

Diagrama de Clases UML
![image](https://github.com/user-attachments/assets/629c246c-29dd-49f6-8da3-a1c2bd6fa3d0)
