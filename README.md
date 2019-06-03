# BottomNavigationWithJetpackNavigation

This is a example for the implementation navigation jetpack with bottom navigation.

# Start

The first thing you should know is how the Navegation Jetpack works. 
The basic idea of this new navigation, is that we have a resource called NavGraph, which can contain a set of fragments that connect to each other, with it we have a visual way of seeing the navigation that the application will have.

<img width="543" alt="Captura de pantalla 2019-06-02 a la(s) 19 58 18" src="https://user-images.githubusercontent.com/28660273/58768996-d3567200-8570-11e9-84e8-a4549af32ccd.png">

This NavGraph for them to work must be implemented inside a navHost, which is a component that allows you to visualize a navGraph and have all its features (actions, OnBackPress, Animations, etc). 


# How does it work this project?

In this project this Navigation Jetpack will be used through a bottomNavigation, which each item will have its own navigation and maintain it when changing items.

![Diagrama en blanco](https://user-images.githubusercontent.com/28660273/58768846-026be400-856f-11e9-802c-fc2c1ca2b32d.png)


As mentioned before, for a navGraph to work you must add it inside a navHost, this navHost is not created as a resource inside the xml, but is created dynamically depending on which item was selected.


<img width="706" alt="Captura de pantalla 2019-06-02 a la(s) 19 36 37" src="https://user-images.githubusercontent.com/28660273/58769474-7f01c100-8575-11e9-80c0-ea84f5899c73.png">


As you can see in the image, each time you select an item you create or search for a navHost and insert the navGraph associated with the item. Once you get this navHost is replaced in a frameLayout to be displayed.

Everything else, navigation, actions, animations, etc, must be created or managed within the navGraph. 
