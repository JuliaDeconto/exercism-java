import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppointmentScheduller {

        public LocalDateTime schedule(String appointmentDateDescription) {

            DateTimeFormatter parser =
                    DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

            LocalDateTime date =
                    LocalDateTime.parse(appointmentDateDescription, parser);

            return date;
        }

        public boolean hasPassed(LocalDateTime appointmentDate) {

            if(appointmentDate.isBefore(LocalDateTime.now()))
                return true;
            else
                return false;
        }

        public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {

            if(appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18)
                return true;
            else
                return false;
        }

        public String getDescription(LocalDateTime appointmentDate) {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");

            return "You have an appointment on " + appointmentDate.format(formatter) + ".";
        }

        public LocalDate getAnniversaryDate() {

            int year = LocalDate.now().getYear();

            return LocalDate.of(year, 9, 15);
        }
    }