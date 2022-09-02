package com.likelion.mybatis.design_pattern.facade;

import com.likelion.mybatis.design_pattern.facade.composition.*;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayercd cd;
    Projecttor projecttor;
    TheaterLights lights;
    Screen screen;
    PopcronPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayercd cd, Projecttor projecttor, TheaterLights lights, Screen screen, PopcronPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projecttor = projecttor;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a move...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projecttor.on();
        projecttor.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.display(movie);
    }

    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projecttor.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
