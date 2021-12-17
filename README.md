This repository contains examples of Data processing using lambdas and the Collection Framework(API)

-we will be looking at the Collection API and how it has been re-written to leverage lambda expressions
-the collection api is divided into two categories: The first one is the Iterable, Collection, List, set, etc
while the second one is Map that provides implementations for HashMaps.
-how to build API in a new way using lambda expressions in java 8


1. Iterable, Collection and List Interface
   let us look at the new methods added to Iterable, Collection and list:

on Iterable:
boolean forEach(Consumer<? super E> consumer);
it takes a Consumer as the parameter, a consumer is a new functional interface in the java.util Package that
was introduced in java 8.

on collection:
boolean removeIf(Predicate<? super E> filter);
it takes a Predicate as the parameter, a predicate takes an Object and returns boolean . It can be used as a filter on
all the data processing pipelines.

on list interface:
boolean replaceAll(UnaryOperator<? super E> operator);
it takes a UnaryOperator as a parameter, a UnaryOperator is a special kind of Function that takes an element of Type E and
return an element of the same Type E.

boolean sort(Comparator<? super E> comparator);
it takes Comparator as a parameter, a Comparator interface

on map interface:
void forEach(BiConsumer<? super K, ? super V> consumer);
it takes a BiConsumer as a parameter which has a key-value pair, it is the same as the ForEach method from the iterable interface.
Note that Iterable is the basis interface of the Collection API

on map interface:
V getOrDefault(Object key, V defaultValue);
if the key exist, it will return the value but if it does not exist it will return the defaultValue
a new version of the get method of the map interface, old version- map.get()

on map interface:
V putIfAbsent(K Key, V value);
n new version of the put method of the map interface, it checks if a key is present ,if the key is present it won't
modify the map but if the key is absent then it will pass the past values to the map

on map interface:
V replace(K Key, V newValue); only if key already exit in the map like update
boolean replace(K Key, V existingValue, V newValue);   newValue replaces existingValue only if the existingValue matches the value in the map
void replaceAll(BiFunction<? super K, ? super V, ? extends V> function);
void remove(Object Key, Object value); checks if a given key is associated to a certain value if yes remove it.


a new family of methods:compute*()

on map interface
V compute(K Key, Bifunction<? super K, ? super V, ? extends V> remapping); it compute a new value from the key passed as a parameter, that may not be in the map.
V computeIfAbsent(K Key, Function<? super K, ? super V> mapping); it compute a new value from the key passed as a parameter, that should not be in the map
V computeIfPresent(K Key, Bifunction<? super K, ? super V, ? extends V> remapping); it takes a key as parameter and the BiFunction

