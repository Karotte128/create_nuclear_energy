# Create Fabric Addon Template

This template mod comes pre-configured for developing an addon mod for Create on Fabric.


## Setup

This template is an extension of the base [Fabric Example Mod](https://github.com/FabricMC/fabric-example-mod).
Setup is mostly the same.

Additionally, set `recipe_viewer` in [gradle.properties](gradle.properties). Remember to remove unused
example code. Make sure versions are up-to-date.

When you publish your mod, you should use jars provided by GitHub Actions. These jars will have
build number metadata and will be compressed by the Machete plugin.

