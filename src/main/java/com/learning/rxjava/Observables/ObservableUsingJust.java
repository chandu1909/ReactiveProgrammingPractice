package com.learning.rxjava.Observables;



import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** @Author chandra sekhar Polavarapu */
public class ObservableUsingJust {
  private static final Logger LOGGER = LoggerFactory.getLogger(ObservableUsingJust.class);

  public static void main(String[] args) {
    //
    Observable.just("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")
        .subscribe(
            new Observer<String>() {
              @Override
              public void onSubscribe(Disposable d) {
                  LOGGER.info("onSubscribe");
              }

              @Override
              public void onNext(String s) {
                  LOGGER.info("onNext -> {}",s);
              }

              @Override
              public void onError(Throwable e) {
                  LOGGER.info("onError {}",e.getMessage());
              }

              @Override
              public void onComplete() {
                  LOGGER.info("onComplete");
              }
            });
  }
}
