/*
 * Copyright Wen Bian. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 * - Redistributions of source code must retain the above copyright notice, this list
 *   of conditions and the following disclaimer.
 *
 * - Redistributions in binary form must reproduce the above copyright notice, this
 *   list of conditions and the following disclaimer listed in this license in the
 *   documentation and/or other materials provided with the distribution.
 *
 * - Neither the name of the copyright holders nor the names of its contributors may
 *   be used to endorse or promote products derived from this software without specific
 *   prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF
 * THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package us.fibernet.fiberj.simplemenu;


/**
 * A utility class containing the main window's menu data
 */
public final class MenuDataMain extends MenuDataImpl {

    private static final String[][] MENU_NAMES = {
        { "File",    /**/ "Open", "Save", "Close", "Exit" },
        { "Image",   /**/ "Flip", "Rotate", "Resize", "Crop" },
        { "Colormap",/**/ "Load", "Save", "Customize"},
        { "Draw",    /**/ "Circle", "Resolution Circle", "Layerline", "Refresh", "Clear All" },
        { "Process", /**/ "Filter", "Plot", "Correction", "Transform", "Background"},
        { "Window",  /**/ "Parameter", "Coordinates", "Pixel Viewer", "Log" },
        { "Help",    /**/ "About", "Resource" }
    };

    // one handler per menu
    private static final MenuHandlerMain[] MENU_HANDLERS = {
        new MenuHandlerMainFile(),     // File
        new MenuHandlerMain(),         // Image     // TODO
        new MenuHandlerMain(),         // Colormap  // TODO
        new MenuHandlerMain(),         // Draw      // TODO
        new MenuHandlerMain(),         // Process   // TODO
        new MenuHandlerMain(),         // Window    // TODO
        new MenuHandlerMain()          // Help      // TODO
    };

    public MenuDataMain() {
    }

    @Override
    protected String[][] getMenuNames() {
        return MENU_NAMES;
    }

    @Override
    protected MenuHandler getMenuHandler(int menuID, int menuItemID) {
        return MENU_HANDLERS[menuID];
    }

} // class MenuMain
