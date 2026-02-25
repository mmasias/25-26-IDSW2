public class MotorDecision {
    private double[] logits = {2.3, 1.1};
    
    public String decide(String contexto) {
        double[] probs = softmax(logits);
        String decision = muestrear(probs);
        
        System.out.println("MotorDecision: logits=[" + logits[0] + "," + logits[1] + "]");
        System.out.println("MotorDecision: probs=[" + String.format("%.2f", probs[0]) + "," + String.format("%.2f", probs[1]) + "]");
        
        return decision;
    }
    
    private double[] softmax(double[] logits) {
        double max = Math.max(logits[0], logits[1]);
        double sumExp = Math.exp(logits[0] - max) + Math.exp(logits[1] - max);
        return new double[] {
            Math.exp(logits[0] - max) / sumExp,
            Math.exp(logits[1] - max) / sumExp
        };
    }
    
    private String muestrear(double[] probs) {
        double r = Math.random();
        if (r < probs[0]) return "Opción 1";
        return "Opción 2";
    }
}
