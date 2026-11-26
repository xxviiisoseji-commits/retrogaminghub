RETRO GAMING HUB 2.0 — ANDROID PWA

CONTENTS
- index.html: app + embedded mGBA WebAssembly engine
- manifest.webmanifest: Android install metadata
- sw.js: offline app-shell cache
- icons/: PWA icons

INSTALL ON ANDROID
1. Upload/extract this entire folder to an HTTPS static host. Examples: GitHub Pages, Netlify, or another HTTPS web host. Keep the folder structure unchanged.
2. On Android, open the HTTPS address in Chrome.
3. Wait for the page to finish loading once (this caches the app shell).
4. Tap the Install button if it appears, or Chrome menu ⋮ > Install app / Add to Home screen.
5. Launch Retro Hub from the Android home screen.

OFFLINE
After the first successful online load, the app shell and embedded emulator engine are cached. Launch it once online before using offline. Imported ROMs and their automatic battery-save backups are stored locally in that browser/app installation using IndexedDB.

IMPORTANT
- PWA installation and service workers require HTTPS (localhost is also allowed for development). Opening index.html directly from Downloads does not install the PWA or enable service-worker offline caching.
- Browser storage is local to the browser profile / installed web app on that device. It is not synced to another phone. Export .sav and .state files for manual transfer.
- This package does not include ROMs. Import only game files you are authorized to use.
- The emulator uses embedded mGBA-wasm 0.3.1 (MPL-2.0).

TROUBLESHOOTING
If Chrome does not offer installation, open the HTTPS site in Chrome (not an in-app browser), reload once, and check that manifest.webmanifest and sw.js are served from the same folder as index.html.
