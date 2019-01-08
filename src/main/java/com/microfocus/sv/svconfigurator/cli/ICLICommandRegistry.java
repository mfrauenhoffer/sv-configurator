/*
 *  Certain versions of software and/or documents ("Material") accessible here may contain branding from
 *  Hewlett-Packard Company (now HP Inc.) and Hewlett Packard Enterprise Company.  As of September 1, 2017,
 *  the Material is now offered by Micro Focus, a separately owned and operated company.  Any reference to the HP
 *  and Hewlett Packard Enterprise/HPE marks is historical in nature, and the HP and Hewlett Packard Enterprise/HPE
 *  marks are the property of their respective owners.
 * __________________________________________________________________
 * MIT License
 *
 * Copyright (c) 2012-2018 Micro Focus or one of its affiliates.
 *
 * The only warranties for products and services of Micro Focus and its affiliates
 * and licensors ("Micro Focus") are set forth in the express warranty statements
 * accompanying such products and services. Nothing herein should be construed as
 * constituting an additional warranty. Micro Focus shall not be liable for technical
 * or editorial errors or omissions contained herein.
 * The information contained herein is subject to change without notice.
 * __________________________________________________________________
 *
 */
package com.microfocus.sv.svconfigurator.cli;

import com.microfocus.sv.svconfigurator.core.impl.exception.SVCParseException;

/**
 * A registry that stores the supported command to be executed in the command line tool.
 */
public interface ICLICommandRegistry {

    /**
     *
     * @param command
     * @return
     * @throws SVCParseException If there is no command serverclient factory for specified command in the registry
     */
    ICLICommandProcessor lookupCommandProcessor(String command) throws SVCParseException;

    /**
     * Returns the CLI help with all the registered commands.
     * @return
     */
    String getCLICommandHelp();

}