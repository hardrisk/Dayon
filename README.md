# Dayon! 
[![Build Status](https://travis-ci.org/RetGal/Dayon.svg?branch=master)](https://travis-ci.org/RetGal/Dayon)
![Java CI (Maven)](https://github.com/RetGal/Dayon/workflows/Java%20CI%20(Maven)/badge.svg)
![Java CI (Ant)](https://github.com/RetGal/Dayon/workflows/Java%20CI%20(Ant)/badge.svg)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=RetGal_Dayon&metric=alert_status)](https://sonarcloud.io/dashboard?id=RetGal_Dayon)
[![dayon](https://snapcraft.io/dayon/badge.svg)](https://snapcraft.io/dayon)

Dayon! is an easy to use, cross-platform remote desktop assistance solution.

It consists of two parts - one for the assistant and one for the assisted. Both are included in one single package.
As quick launch versions for Windows, they are also available as individual binaries.

## Key features

- easy setup
- no router or network configuration needed on the assisted side
- intuitive, multilingual user interface (de, en, es, fr, ru)
- assistant and assisted functionality in same packet
- secure, encrypted communication (TLS)
- cross-platform
- open source
- free (as hugs)

## History

Dayon! was originally developed by Marc Polizzi back in 2008.

With his consent, I have taken over the maintenance and further development of this software in late 2016.
I also moved the code base to GitHub, where it can easier be maintained.

## Releases

The ![latest version](https://github.com/RetGal/Dayon/releases) is v1.10 (Lucky Lobster) - released more than ten years after the initial release.

This version comes with a new connection protocol, allowing the clipboard to be shared between assisted and assistant.

Also available as snap:

[![Get it from the Snap Store](https://snapcraft.io/static/images/badges/en/snap-store-black.svg)](https://snapcraft.io/dayon)

## Website

[Deutsch](https://retgal.github.io/Dayon/de_index.html)<br>
[English](https://retgal.github.io/Dayon/index.html)<br>
[Français](https://retgal.github.io/Dayon/fr_index.html)<br>

Currently, there is no online documentation available for Spanish and Russian.
Please refer to the [English](https://retgal.github.io/Dayon/index.html)
 version.
 
## Screen

![Assistant connected](/docs/assistant_connected.jpg?raw=true "Assistant connected")

## Trivia

Dayon! means "Come in!" in Visayas - a local Philippine dialect. 

## Developers

The project can be built with Maven:

``mvn clean package``

or with Ant:

``ant clean build``

Have a look at ``pom.xml`` or ``build.xml`` for details and advanced options.
 
## Contributors
 
Any feedback and contributions are very welcome. 

You don't have to be a programmer!

For example translations for additional languages would make this app more useful for more earthlings - see: [src/main/resources/Babylon.properties](https://github.com/RetGal/Dayon/blob/master/src/main/resources/Babylon.properties) or [docs](https://github.com/RetGal/Dayon/tree/master/docs)

Some additional testing, especially on macOS would also be highly appreciated.

 
