### build for [sixty-percent-karabiner](https://github.com/tom-power/sixty-percent-karabiner) using [karabiner-kt](https://github.com/tom-power/karabiner-kt)

```shell
clone https://github.com/tom-power/sixty-percent-karabiner-kt.git &&
cd sixty-percent-karabiner-kt &&
./gradlew build &&
cp ./app/build/*.json ~/.config/karabiner/assets/complex_modifications/
```

The rules will need to be loaded in the Karabiner elements UI:

```"Preferences" -> "Complex Modifications" -> "Add rule" -> "sixty-percent ..." -> "Enable all"```
