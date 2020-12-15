import com.design.sagar.controller.impl.RequestSchedulerImpl;
import com.design.sagar.data.RequestQueue;
import com.design.sagar.domain.Direction;
import com.design.sagar.domain.Request;
import com.design.sagar.requestor.impl.ExternalButtonImpl;
import com.design.sagar.requestor.impl.InternalButtonImpl;

/**
 * 
 */

/**
 * @author seemasagar
 *
 */
public class TestElevatorSystem {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		ExternalButtonImpl external = new ExternalButtonImpl("B0", "1");
		Request request = new Request();
		request.setRequestType(external.getButtonType());
		request.setSrcFloor(external.getFloor());
		request.setDirection(Direction.UP);
		external.onPress(request);

		ExternalButtonImpl external2 = new ExternalButtonImpl("B0", "2");
		request = new Request();
		request.setRequestType(external.getButtonType());
		request.setSrcFloor(external.getFloor());
		request.setDirection(Direction.UP);
		external.onPress(request);

		InternalButtonImpl internal = new InternalButtonImpl("A0", "1", "1");
		request = new Request();
		request.setRequestType(internal.getButtonType());
		request.setSrcFloor(internal.getFloor());
		request.setDestFloor(internal.getElevatorId());
		external.onPress(request);

		RequestSchedulerImpl scheduler = new RequestSchedulerImpl();
		int i = 1;
		while (i < 10) {
			Thread.sleep(2000);
			if (i%3 == 0) {
				InternalButtonImpl internal1 = new InternalButtonImpl("A0", "1", "1");
				request = new Request();
				request.setRequestType(internal1.getButtonType());
				request.setSrcFloor(internal1.getFloor());
				request.setDestFloor(internal1.getElevatorId());
				external.onPress(request);
			}
			i++;
			System.out.println(" Requests pending in the queue " + RequestQueue.getInstance().size());
			Request queueRequest = RequestQueue.getInstance().peek();
			if (null != request)
				scheduler.assignElevator();

			
		}

	}

}
