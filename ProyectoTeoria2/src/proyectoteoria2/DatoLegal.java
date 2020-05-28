/*
    Clase de Datso Legales
 */
package proyectoteoria2;

import java.util.Date;
import java.util.Objects;

public class DatoLegal {
    
        private String id;
        private boolean esMayor, estuvoPreso, tieneLicencia;
        public DatoLegal(){}

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public boolean isEsMayor() {
            return esMayor;
        }

        public void setEsMayor(boolean mayor) {
            this.esMayor = mayor;
        }

        public boolean isEstuvoPreso() {
            return estuvoPreso;
        }

        public void setEstuvoPreso(boolean estuvoPreso) {
            this.estuvoPreso = estuvoPreso;
        }

        public boolean isTieneLicencia() {
            return tieneLicencia;
        }

        public void setTieneLicencia(boolean tieneLicencia) {
            this.tieneLicencia = tieneLicencia;
        }

        @Override
        public String toString() {
            return "DLeagales{" + "id=" + id + ", esMayor=" + esMayor + ", estuvoPreso=" + estuvoPreso + ", tieneLicencia=" + tieneLicencia + '}';
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 59 * hash + Objects.hashCode(this.id);
            hash = 59 * hash + (this.esMayor ? 1 : 0);
            hash = 59 * hash + (this.estuvoPreso ? 1 : 0);
            hash = 59 * hash + (this.tieneLicencia ? 1 : 0);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final DatoLegal other = (DatoLegal) obj;
            if (this.esMayor != other.esMayor) {
                return false;
            }
            if (this.estuvoPreso != other.estuvoPreso) {
                return false;
            }
            if (this.tieneLicencia != other.tieneLicencia) {
                return false;
            }
            if (!Objects.equals(this.id, other.id)) {
                return false;
            }
            return true;
        }
        
       
}
