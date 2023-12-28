package CodigoPOO;

    public class Exercicio15_CLASSE {

        //Atributos
        private double kmPercorrido;
        private double kmAPagar;

        private int diasAlugados;
        private double diasAPagar;

        private double totalAPagar;

        //Getters e Setters    
        public double getKmPercorrido() {
            return kmPercorrido;
        }

        public void setKmPercorrido(double kmPercorrido) {
            this.kmPercorrido = kmPercorrido;
        }

        public double getKmAPagar() {
            return kmAPagar;
        }

        public void setKmAPagar(double kmAPagar) {
            this.kmAPagar = kmAPagar;
        }

        public int getDiasAlugados() {
            return diasAlugados;
        }

        public void setDiasAlugados(int diasAlugados) {
            this.diasAlugados = diasAlugados;
        }

        public double getDiasAPagar() {
            return diasAPagar;
        }

        public void setDiasAPagar(double diasAPagar) {
            this.diasAPagar = diasAPagar;
        }

        public double getTotalAPagar() {
            return totalAPagar;
        }

        public void setTotalAPagar(double totalAPagar) {
            this.totalAPagar = totalAPagar;
        }

        //Metodos
        public void calcularKM(){
            kmAPagar = (kmPercorrido*0.15);
        }

        public void calcularDias(){
            diasAPagar = (diasAlugados*60);
        }

        public void calcularTotal(){
            totalAPagar = (kmAPagar+diasAPagar);
        }

        public void zerarValoresKM(){        
            kmPercorrido=0;
            kmAPagar=0;
        }
    
}
