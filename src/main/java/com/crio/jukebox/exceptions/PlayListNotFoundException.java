package com.crio.jukebox.exceptions;

public class PlayListNotFoundException extends RuntimeException {

  public PlayListNotFoundException() {
    super();
  }

  public PlayListNotFoundException(String message) {
    super(message);
  }
}
