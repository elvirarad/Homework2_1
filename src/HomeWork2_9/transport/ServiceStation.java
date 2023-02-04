package HomeWork2_9.transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport<?>> transportQueue = new ArrayDeque<>();

    public void addCarToQueue (Transport<?> transport){
        if (transport instanceof Bus){
            System.out.println("Автобусы не проходят техобслуживание");
        } else {
            transportQueue.add(transport);
        }

    }

    public void carryOutMaintenance () {
        Transport<?> transport = transportQueue.poll();
        if (transport != null){
            transport.getMechanics().get(0).carryOutMaintenance();

        }
    }
}
