# LegacyItemStackConstructor
A very simple project for using Spigot's ItemStack(int, int, short) constructor in multi-version plugins.

## Introduction

You may be developing a Spigot plugin with support for multiple versions. You want to support MC 1.8. To do this, you need to call the constructor `ItemStack(int, int, short)` for *1.8.8 only*. However, the rest of your plugin must build against a newer version of Spigot. The constructor doesn't exist in newer versions.

The really painful solution is described [here](https://github.com/pablo67340/GUIShop/pull/44#issuecomment-601844449) – a disjoined build process which is very frustrating.

## The Solution

