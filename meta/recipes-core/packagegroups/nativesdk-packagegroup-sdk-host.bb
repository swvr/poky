#
# Copyright (C) 2007 OpenedHand Ltd
#

SUMMARY = "Host packages for the standalone SDK or external toolchain"
PR = "r12"

inherit packagegroup nativesdk

PACKAGEGROUP_DISABLE_COMPLEMENTARY = "1"

RDEPENDS:${PN} = "\
    nativesdk-pkgconfig \
    nativesdk-qemu \
    nativesdk-qemu-helper \
    nativesdk-pseudo \
    nativesdk-unfs3 \
    nativesdk-opkg \
    nativesdk-libtool \
    nativesdk-autoconf \
    nativesdk-automake \
    nativesdk-shadow \
    nativesdk-makedevs \
    nativesdk-cmake \
    nativesdk-meson \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'nativesdk-wayland', '', d)} \
    nativesdk-sdk-provides-dummy \
    nativesdk-bison \
    nativesdk-flex \
    "

RDEPENDS:${PN}:darwin = "\
    nativesdk-pkgconfig \
    nativesdk-opkg \
    nativesdk-libtool \
    "
