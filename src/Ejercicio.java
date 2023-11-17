import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Ejercicio {
    public static void main(String[] args) {
        //Crear un objeto fecha para el inicio del curso con mes numerico y con la enumeración

        LocalDate inicioCurso = LocalDate.of(2023, 10, 9);
        LocalDate inicioCurso2 = LocalDate.of(2023, Month.OCTUBER, 9);
        System.out.println("Inicio curso:" + inicioCurso);



        //Crear un objeto fecha para el final del curso

        LocalDate finCurso=LocalDate.of(2024, Month.MARCH, 22);
        LocalDate finCurso2=LocalDate.of(2024, 3, 22);


        //Sumar a la fecha de inicio del curso 5 semanas

        LocalDate inicioCursoMas5Semanas= inicioCursoMas5Semanas.plusWeeks(5);


        //Restar a la fecha de final del curso 80 dias

        System.out.println(finCurso.minusDays(80));



        //Crear una fecha del día 100 de este año

        LocalDate dia100DelAño = LocalDate.ofYearDay(2023, 100);
        System.out.Println("Dia 100 del este año:" + dia100DelAño);



        //Crear la hora del momento en que estas haciendo este ejercicio llamada ahora

        LocalDate horaActual= LocalTime.now();


        //Crear la hora del inicio del curso

        LocalTime HoraInicoCurso=LocalTime.of(15,0);


        //Sumar 5 horas a la hora de inicio de curso

        LocalTime horaInicioCurso=LocalTime.of(20,0);


        //En 8 semanas será la fecha

        LocalDate fechaEn8Semanas=LocalDate.now().plusWeeks(8);


        //Hace 8 semanas era la fecha

        LocalDate hace8Semanas=LocalDate.now().minusWeeks(8);


        //Sumar a la fecha de inicio de curso 3 días y restarle 2 hrs

        LocalDate inicioCursoConAjuste= LocalDateTime.of(inicioCurso,horaInicioCurso);



         //Imprimir por la consola si la fecha ahora es antes de la hora de salida

        if (LocalTime.now().isAfter(horaSalida)) {
            System.out.println("Es antes");
        }else{
            System.out.println("Es despues");}



         //Imprimir por la consola si la fecha ahora es despues de la hora de entrada

        if (LocalTime.now().isBefore(horaSalida)) {
            System.out.println("Es antes");
        }else{
            System.out.println("Es despues");}


         //Calcular los años trabajados en una empresa del un empleado que inició a trabajar el 6 de Julio de 2012

        LocalDate fechaInicioTrabajo=LocalDate.of(2012,7,6);
        LocalDate fechaActual=LocalDate.now();
        Period periodo=Period.between(fechaInicioTrabajo,fechaActual);
        int añosTrabajados=periodo.getYears();
        System.out.println("El empleado ha trabajado"+añosTrabajados+"años");


        //Calcular la edad de una persona que nació el 7 de Agosto de 2007

        LocalDate fechaNacimiento=LocalDate.of(2007,Month.AUGUST, 7);
        Period edad=fechaNacimiento.between(fechaNacimiento, LocalDate.now());
        System.out.println("Edad:"+edad);


        // Se tiene una fecha de fabricación y una fecha de expiración calcular el periodo en el que se puede consumir ese producto

        LocalDate b=LocalDate.of(2025,4,2);
        LocalDate a=LocalDate.of(2023,5,2);
        Period ayb=Period.between(a,b);
        System.out.println(ayb);

        //Declarar la fecha de Navidad y declarar la fecha de Noche Vieja

        LocalDate navidad=LocalDate.of((LocalDate.now().getYear(),Month.DECEMBER,25);


        //Compararlas con los métodos isBefore y isAfter
        if (navidad.isBefore(nocheVieja)) {
            System.out.println("Navidad es antes de noche vieja");
        }else {
            System.out.println("Navidad es después de noche vieja");
        }


        //Con esta matriz de formato {"dd/MM/yyyy","d '('E')' MMM YYYY","w'º semana de ' YYYY","EEEE, dd MMM, YYYY"};
        //Aplicarla a la fecha hora actual
        System.out.println("Diferentes formatos");
        LocalDateTime fechaHoraActual=LocalDateTime.now();
        DateTimeFormatter[] formatos={
                DateTimeFormatter.ofPattern("dd/MM/yyyy"),
                DateTimeFormatter.ofPattern("d,('E)'MMM yyyy"),
                DateTimeFormatter.ofPattern("W  semana de   yyyy"),
                DateTimeFormatter.ofPattern("EEEE, dd  MMM, yyyy")};
        for (DateTimeFormatter formato: formatos){
            System.out.println(fechaHoraActual.format(formato));
        }
    }


}
