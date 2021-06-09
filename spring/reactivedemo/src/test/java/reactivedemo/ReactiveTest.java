package reactivedemo;

import org.junit.Test;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class ReactiveTest {

	@Test
	public void testReactive() {
		Flux strFlux=Flux.just("String1","2","3");
		
		Flux strFlux2=Flux.just("String1","2","3");
		
		Flux mergedFulx=Flux.zip(strFlux,strFlux2);
		
		//strFlux.flatMap(s->s).log();
		
		StepVerifier.create(mergedFulx.log()).expectNextCount(6).verifyComplete();
	}
	
	
	
	
}
