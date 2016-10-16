package de.petendi.ethereum.signer;

/*-
 * #%L
 * Ethereum Secure Proxy
 * %%
 * Copyright (C) 2016 P-ACS UG (haftungsbeschränkt)
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.ParserProperties;

public class CmdLineResult {



    @Option(name = "--create",usage = "Create a new deterministic seed")
    private boolean create;

    @Option(name ="--signwith", usage = "The private key to sign the transaction")
    private String privateKey;

    @Option(name = "--transaction",usage = "The transaction to be signed")
    private String transaction;

    @Option(name = "--derive",usage = "Derive a key")
    private String deriveKey;

    @Option(name = "--derivationIteration",usage = "Derivation iteration")
    private int derivationIteration;


    public boolean isCreate() {
        return create;
    }



    public String getPrivateKey() {
        return privateKey;
    }



    public String getTransaction() {
        return transaction;
    }


    public String getDeriveKey() {
        return deriveKey;
    }




    public int getDerivationIteration() {
        return derivationIteration;
    }



    void parseArguments(String[] arguments) throws CmdLineException {
        CmdLineParser parser = new CmdLineParser(this);
        parser.parseArgument(arguments);
    }

    void printExample() {
        CmdLineParser parser = new CmdLineParser(this, ParserProperties.defaults().withShowDefaults(false));
        parser.printUsage(System.out);
    }



}
